

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String email = request.getParameter("userEmail");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Welcome User</h1>");
		out.print("<h3>You are login with, "+email+"</h3>");
		
		out.close();
		
	}

}
