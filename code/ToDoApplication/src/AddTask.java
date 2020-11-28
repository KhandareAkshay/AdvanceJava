

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Create New Task</title>");
		out.print("</head>");
		
		out.print("<body>");
		
		
		RequestDispatcher dis = request.getRequestDispatcher("menu.html");
		dis.include(request, response);
		
		out.print("<center>");
		
		
		String code = request.getParameter("code");
		
		if(code != null){
			if("1".equals(code)){
				out.print("<font color='green'><h3>Your Task has been created Successfully.</h3></font>");
			}else if("2".equals(code)){
				out.print("<font color='red'><h3>Error While creating task. Please try after sometime!!</h3></font>");
			}
		}
		
		
		ArrayList<String> error = (ArrayList<String>)request.getAttribute("ers");
		
		if(error!=null && !error.isEmpty()){
			for(String str : error){
				out.print("<font color='red'>"+str+"</font><br>");
			}	
		}
		
		
		out.print("<form action='AddTaskController' method='post'>");
			out.print("Title : <input type='text' name='title'><br/><br/>");
			out.print("Desc : <textarea rows='5' col='11' name='titleDesc'></textarea><br/><br/>");
			out.print("Date : <input type='date' name='titleDate'><br/><br/>");
			out.print("<input type='submit' value='Create Task'><br/><br/>");
		out.print("</form>");
		out.print("</center>");
		
		out.print("</body>");
		out.print("</html>");
		
		
		out.close();
		
	}

}
