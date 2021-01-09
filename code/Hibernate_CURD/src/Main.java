import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.setName("lmn");
		stud.setEmail("lmn@gmail.com");
		
		Configuration cfg = new AnnotationConfiguration();;
			cfg.configure("hibernate-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
				Transaction trx = session.beginTransaction();
					//=============to insert data==============
					/*int id = (int) session.save(stud);
					System.out.println("Student Id : "+id);*/
					
					/*session.persist(stud);*/
					
					//=============to select data==============
					/*Student s = (Student) session.get(Student.class, 3);
					System.out.println(s.getName());
					System.out.println(s.getEmail());*/
					
					
					/*Student s = (Student) session.load(Student.class, 3);
					System.out.println(s.getName());
					System.out.println(s.getEmail());*/
					
					//=============to update data==============
					/*Student studUpdate = new Student();
					studUpdate.setId(2);
					studUpdate.setEmail("xyz@yahoo.com");
					studUpdate.setName("Xyz");
					session.update(studUpdate);*/
					
					/*Student studUpdate = new Student();
					studUpdate.setId(5);
					studUpdate.setEmail("test@yahoo.com");
					studUpdate.setName("test");
					session.saveOrUpdate(studUpdate);*/
				
					//=============to Delete data==============
					/*Student studDelete = new Student();
					studDelete.setId(2);
					session.delete(studDelete);*/
				trx.commit();
			session.close();			
		sf.close();
		
		
	}

}
