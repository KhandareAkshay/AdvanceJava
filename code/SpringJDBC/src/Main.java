import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		QuestionModel model = ctx.getBean("model", QuestionModel.class);
		//model.saveQuestion();
		
		//model.updateQuestion(1, "What is use of Java?");
		
		//model.getDataByFunction();
		
		model.getDataByBeanRowMapper();
	}

}
