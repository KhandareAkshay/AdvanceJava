import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {

	public static void main(String[] args) {

		Student stud = new Student();
		stud.setId(1);
		stud.setName("Abc");
		stud.setEmail("Abc@gmail.com");
		stud.setContact("9988776655");
		
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trx = session.beginTransaction();
		
		session.save(stud);
		
		trx.commit();
		session.close();
		sf.close();
		
	}

}
