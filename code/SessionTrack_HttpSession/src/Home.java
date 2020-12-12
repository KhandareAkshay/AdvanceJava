

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		//Create session for use if not exist else return same session
		HttpSession session = request.getSession();
		String user = (String)session.getAttribute("un");
		
		if(user == null) {
			response.sendRedirect("Login?msg=You Session is expired or not exist. Please login in to application");
		}
		
		out.print("<h1>Welcome User....."+user+"</h1>");
		
		out.print("<h1><a href='Logout'>Logout</a></h1>");
	}

}
