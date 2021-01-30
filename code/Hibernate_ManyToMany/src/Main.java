import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Skill s1 = new Skill();
		s1.setName("Java");
		
		Skill s2 = new Skill();
		s2.setName("Dot Net");
		
		Skill s3 = new Skill();
		s3.setName("Angular Js");
		
		
		
		Student stud1 = new Student();
		stud1.setName("Abc");
		List<Skill> stud1Skills = Arrays.asList(s1,s3);
		stud1.setSkills(stud1Skills);
		
		Student stud2 = new Student();
		stud2.setName("Pqr");
		List<Skill> stud2Skills = Arrays.asList(s2);
		stud2.setSkills(stud2Skills);

		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		/*
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		session.save(stud1);
		session.save(stud2);
		*/
		
		Student stud = (Student)session.get(Student.class, 1);
		System.out.println("Id : "+ stud.getId());
		System.out.println("Name : "+ stud.getName());
		for(Skill sk : stud.getSkills()){
			System.out.println("Skill : "+sk.getName());
		}
		
		tr.commit();
		session.close();
		sf.close();
		
		
		
	}

}













