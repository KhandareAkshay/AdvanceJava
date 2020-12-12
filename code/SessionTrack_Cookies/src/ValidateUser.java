
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateUser extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("uname");
		String pass = request.getParameter("password");
		String remember = request.getParameter("rememberme");

		if (remember != null) {
			Cookie userNameCookie = new Cookie("un", userName);// To create Cookie
			userNameCookie.setMaxAge(60*60*24);//user to create persistent cookie
			response.addCookie(userNameCookie);// To add cookie into response and sent to client side
		}

		out.print("<h1>Hello User : "+userName+"</h1>");

	}

}
