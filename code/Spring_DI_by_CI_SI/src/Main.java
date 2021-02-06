import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
			Student stud = new Student();
			stud.setId(23);
			stud.setName("Abc");
			
			Address addr = new Address("Mumbai","669988");
			
			stud.setAddress(addr); //DI by SI
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-DI-CI.xml");
		Student stud = context.getBean("stud", Student.class);
		System.out.println(stud.getId());
		System.out.println(stud.getName());
		System.out.println(stud.getAddress().getCity());
		System.out.println(stud.getAddress().getPincode());
		
		
	}

}
