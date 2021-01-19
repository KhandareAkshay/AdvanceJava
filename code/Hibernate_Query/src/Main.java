import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {
	public static void main(String[] args) {

		
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trx = session.beginTransaction();
		
		/*
		 * HQL 
		 * 		Hibernate Query Language
		 * 		Have to use Class Name and field name to execute query
		 * 		
		 * SQL
		 * 		Structure Query Language
		 * 		Have to use table name and column name
		 * 
		 */
		
		/*Query query = session.createQuery("from Student");  //HQL way to execute Select * query
		//Query query = session.createSQLQuery("select * from studinfo","",Student.class); //HSQL way to execute Select * query
		List<Student> list = query.list();
		
		for(Student s : list){
			System.out.print(s.getId()+"\t");
			System.out.print(s.getName()+"\t");
			System.out.println(s.getEmail());
		}*/
		
		/*Query query = session.createQuery("update Student set email=? where id=?");// parameterized query
		query.setString(0, "pqr@gmail.com");
		query.setInteger(1, 3);*/
		
		/*Query query = session.createQuery("update Student set email=:e where id=:i"); // named parameterized query
		query.setString("e", "pqr@yahoo.com");
		query.setInteger("i", 3);*/
		
		Query query =session.getNamedQuery("updateStudentEmail"); //named Query 
		query.setString("e", "pqr@yahoo.com");
		query.setInteger("i", 3);
		
		query.executeUpdate();
		
		trx.commit();
		sf.close();
		
	}
}
