
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String title = request.getParameter("title");
		String desc = request.getParameter("titleDesc");
		String date = request.getParameter("titleDate");
		
		TaskService taskService=new TaskService();
		boolean result = taskService.save(title, desc, date);
		
		
		if(result){
			response.sendRedirect("AddTask?code=1");
		}else{
			response.sendRedirect("AddTask?code=2");
		}
		
	}

}
