import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		/*User user = new User();
			user.setName("Abc");
			user.setEmail("abc@gmail.com");
		
		Address address = new Address();
			address.setCity("Mumbai");
			address.setState("MH");
			address.setPincode("400027");
			address.setUid(user);*/
			
			
		
		Configuration config = new AnnotationConfiguration();
		config.configure("hibernate-cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trx = session.beginTransaction();
		
		/*session.save(user);
		session.save(address);*/
		
		User usr = (User)session.get(User.class, 1);
		
		System.out.println("name : "+ usr.getName());
		System.out.println("Email : "+ usr.getEmail());
		System.out.println("City : "+ usr.getAddress().getCity());
		System.out.println("State : "+ usr.getAddress().getState());
		System.out.println("Pincode : "+ usr.getAddress().getPincode());
		
		
		
		/*Address address = (Address) session.get(Address.class, 1);
		System.out.println("City "+ address.getCity());
		System.out.println("Pincode "+ address.getPincode());
		System.out.println("State "+ address.getState());
		System.out.println("User name  "+ address.getUid().getName());
		System.out.println("User Email  "+ address.getUid().getEmail());*/
		
		
		trx.commit();
		session.close();
		sf.close();
		
			
	}

}
