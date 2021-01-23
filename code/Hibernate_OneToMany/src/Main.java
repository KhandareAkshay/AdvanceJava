import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		/*User user = new User();
		user.setName("Axy");
		user.setEmail("Axy@gmail.com");

		Address address1 = new Address();
		address1.setCity("Mumbai");
		address1.setState("MH");
		address1.setPincode("400024");
		address1.setUid(user);
*/

		Configuration config = new AnnotationConfiguration();
		config.configure("hibernate-cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trx = session.beginTransaction();

		/*session.save(user);
		session.save(address1);*/
		
		User user = (User) session.get(User.class, 1);
		
		System.out.println("Name : "+ user.getName());
		System.out.println("Email : "+ user.getEmail());
		List<Address> userAddr = user.getAddress();
		for (Address address : userAddr) {
			System.out.println("-----------------------------");
			System.out.println("City : "+address.getCity());
			System.out.println("State : "+address.getState());
			System.out.println("Pincode : "+address.getPincode());
		}
		
		
		trx.commit();
		session.close();
		sf.close();

	}

}
