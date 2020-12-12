
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		Cookie[] userCookie = request.getCookies();// tp get all the cookies from request(client side)
		String userName = "";
		if (userCookie != null) {
			for (Cookie ck : userCookie) { // to iterate cookie
				if ("un".equals(ck.getName())) { // to check for specific
					userName = ck.getValue(); // to get value of cookie
				}
			}
		}

		out.print("<html>");
		out.print("<head>");
		out.print("<title>User Login</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<center>");
		out.print("<h3>User Login</h3>");
		out.print("<form action='ValidateUser' method='get'>");
		out.print("User Name : <input type='text' name='uname' value='" + userName + "'><br/><br/>");
		out.print("Password : <input type='password' name='password'><br/><br/>");
		out.print("<input type='checkbox' name='rememberme' value='yes'>Remeber Me?<br/><br/>");
		out.print("<input type='submit' value='Login'><br/><br/>");
		out.print("</form>");
		out.print("</center>");

		out.print("</body>");
		out.print("</html>");

		out.close();
	}

}
