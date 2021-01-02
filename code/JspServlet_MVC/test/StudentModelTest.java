import static org.junit.Assert.*;

import org.junit.Test;

import bean.Student;
import model.StudentModel;

public class StudentModelTest {

	StudentModel studentModel =new StudentModel();

	@Test
	public void testForGetConntection() {
		assertNotNull(studentModel.getConnection());
	}
	
	@Test
	public void testForSave() {
		Student student= new Student();
		student.setName("test1");
		student.setEmail("test1@gmail.com");
		student.setPassword("test123");
		student.setContact("7788665544");
		assertEquals(1,studentModel.save(student));
		
	}
	
	@Test
	public void testForGetStudent() {
		assertNotEquals(0,studentModel.getStudent().size());
		
	}
	

}
