import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		EmployeeProfile profile = new EmployeeProfile();
		profile.setName("Xyz1");
		profile.setEmail("xyz1@gmail.com");
		profile.setContact("9909898765");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmpProfileManage mgmt = ctx.getBean("profileManagement",EmpProfileManage.class);
		mgmt.save(profile);
		//mgmt.update(profile);
		//mgmt.select();
		//mgmt.delete(profile);
	}

}
