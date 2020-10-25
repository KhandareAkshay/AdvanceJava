

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Auth extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("userEmail");
		String password = request.getParameter("userPass");
		
		if("admin@gmail.com".equalsIgnoreCase(email) && "admin123".equals(password)) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("MyHome");
			requestDispatcher.forward(request, response);
		}else {
			response.sendRedirect("UserLogin?code=5");
		}
		
	}

}
