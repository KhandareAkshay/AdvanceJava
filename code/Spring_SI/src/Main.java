import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee e = context.getBean("emp", Employee.class);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getEmail());
		
		System.out.println(e.getContact());
		System.out.println(e.getSkills());
		System.out.println(e.getAddress());
		System.out.println(e.getEmpData());
		
	}

}
