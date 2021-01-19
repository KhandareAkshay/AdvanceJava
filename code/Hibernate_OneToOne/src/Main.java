import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {

	public static void main(String[] args) {
		
		
		Question q1 = new Question();
			q1.setTitle("Why to use of Hibenate?");
			q1.setDescription("I like to know about Hibernte");
			q1.setAskOn(new Date());
		
		Answer a1 = new Answer();
			a1.setTitle("Hibernate Is a Framework");
			a1.setDescription("This is mostly used framework for DB connectivity");
			a1.setGivenOn(new Date());
			a1.setQues(q1);
		
		
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		/*session.save(q1);
		session.save(a1);*/
		
		/*Answer answer = (Answer) session.get(Answer.class, 2);
		
		System.out.println(answer.getaId());
		System.out.println(answer.getTitle());
		System.out.println(answer.getDescription());
		System.out.println(answer.getGivenOn());
		
		System.out.println(answer.getQues().getTitle());
		System.out.println(answer.getQues().getDescription());*/
		
		
		Question ques = (Question) session.get(Question.class, 1);
		System.out.println(ques.getqId());
		System.out.println(ques.getTitle());
		System.out.println(ques.getDescription());
		System.out.println(ques.getAskOn());
		
		tr.commit();
		sf.close();
		
	}

}
