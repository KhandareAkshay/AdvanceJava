

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserEduDetails extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("title");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String gender = request.getParameter("gender");
		
		String addLine1 = request.getParameter("add1");
		String addLine2 = request.getParameter("add2");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pin");
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>User Edu Info</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<center>");
		out.print("<h3>User Edu. Information</h3>");
		out.print("<form action='Summery' method='get'>");
			
			out.print("<input type='hidden' name='title' value="+name+">");
			out.print("<input type='hidden' name='email' value="+email+">");
			out.print("<input type='hidden' name='contact' value="+contact+">");
			out.print("<input type='hidden' name='gender' value="+gender+">");
			out.print("<input type='hidden' name='add1' value="+addLine1+">");
			out.print("<input type='hidden' name='add2' value="+addLine2+">");
			out.print("<input type='hidden' name='city' value="+city+">");
			out.print("<input type='hidden' name='pin' value="+pincode+">");
		
			out.print("Higher Edu : <input type='text' name='edu'><br/><br/>");
			out.print("Passing year : <input type='text' name='passingEdu'><br/><br/>");
			out.print("Percentage(%) : <input type='text' name='percent'><br/><br/>");
			out.print("<input type='submit' value='Preview'><br/><br/>");
		out.print("</form>");
		out.print("</center>");

		out.print("</body>");
		out.print("</html>");

		out.close();
	}

}
