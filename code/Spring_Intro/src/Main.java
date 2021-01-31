import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring-bean.xml");
		
		/*Resource resource = new ClassPathResource("spring-bean.xml");
		BeanFactory container = new XmlBeanFactory(resource);*/
		
		Student student1 = container.getBean("stud1",Student.class);
		Student student2 = container.getBean("stud1",Student.class);
		Student student3 = container.getBean("stud2",Student.class);
		Student student4 = container.getBean("stud2",Student.class);
		Student student5 = container.getBean("stud1",Student.class);
		//student.display();
	}

}
