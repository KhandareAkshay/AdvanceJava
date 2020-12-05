

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAddress extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("title");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String gender = request.getParameter("gender");
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>User Address Info</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<center>");
		out.print("<h3>User Address Information</h3>");
		out.print("<form action='UserEduDetails' method='get'>");
			out.print("<input type='hidden' name='title' value="+name+">");
			out.print("<input type='hidden' name='email' value="+email+">");
			out.print("<input type='hidden' name='contact' value="+contact+">");
			out.print("<input type='hidden' name='gender' value="+gender+">");
			out.print("Address Line 1 : <input type='text' name='add1'><br/><br/>");
			out.print("Address Line 2 : <input type='text' name='add2'><br/><br/>");
			out.print("City : <input type='text' name='city'><br/><br/>");
			out.print("Pincode : <input type='text' name='pin'><br/><br/>");
			out.print("<input type='submit' value='Next'><br/><br/>");
		out.print("</form>");
		out.print("</center>");

		out.print("</body>");
		out.print("</html>");

		out.close();
	}

}
