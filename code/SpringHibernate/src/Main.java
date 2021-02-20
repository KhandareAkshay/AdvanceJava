import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Model model = ctx.getBean("model", Model.class);
		User user = new User();
		user.setEmail("a@gmail.com");
		user.setName("A");
		model.save(user);
	}
}
