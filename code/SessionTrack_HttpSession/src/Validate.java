

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("password");
		
		if("abc@gmail.com".equals(userName) && "abc123".equals(password)) {
			
			//Create session for use if not exist else return same session
			HttpSession session = request.getSession();
			//to set value inside session
			session.setAttribute("un", userName);
			
			response.sendRedirect("Home");
		}else {
			response.sendRedirect("Login?msg=Invalid UserName or password");
		}
	}

}
