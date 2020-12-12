

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("<title>User Login</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<center>");
		out.print("<h3>User Login</h3>");
		
		String msg = request.getParameter("msg");
		
		if(msg != null) {
			out.print("<font color='red'><h4>"+msg+"</h4></font>");
		}
		
		out.print("<form action='Validate' method='post'>");
			out.print("User Name : <input type='text' name='uname'><br/><br/>");
			out.print("Password : <input type='password' name='password'><br/><br/>");
			out.print("<input type='submit' value='Login'><br/><br/>");
		out.print("</form>");
		out.print("</center>");

		out.print("</body>");
		out.print("</html>");

		out.close();
	}

}
