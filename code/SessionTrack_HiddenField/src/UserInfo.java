
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInfo extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("<title>User Info</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<center>");
		out.print("<h3>User Information</h3>");
		out.print("<form action='UserAddress' method='get'>");
		out.print("Name : <input type='text' name='title'><br/><br/>");
		out.print("Email : <input type='text' name='email'><br/><br/>");
		out.print("Contact : <input type='text' name='contact'><br/><br/>");
		out.print(
				"Gender : <input type='radio' name='gender' value='Male'>Male  <input type='radio' name='gender' value='Female'>Female<br/><br/>");
		out.print("<input type='submit' value='Next'><br/><br/>");
		out.print("</form>");
		out.print("</center>");

		out.print("</body>");
		out.print("</html>");

		out.close();

	}

}
