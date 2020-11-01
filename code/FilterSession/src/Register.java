

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>Register User</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<center>");
				out.print("<h2>Create Account</h2>");
				
				String code = request.getParameter("code");
				if(code != null) {
					if("1".equals(code)) {
						out.print("<font color='green'><span>Registrtion Success..</span></font>");
					}
					else if("2".equals(code)) {
						out.print("<font color='red'><span>Registrtion Fail.. Please try after some time..</span></font>");
					}
				}
				
				out.print("<form action='userRegister' method='post'>");
					out.print("Enter Name <input type='text' name='name' placeholder='Enter You Full Name'><br><br>");
					out.print("Enter Email <input type='email' name='email' placeholder='Enter You Email Id'><br><br>");
					out.print("Enter Password <input type='password' name='pass' placeholder='Enter You Password'><br><br>");
					out.print("Confirm password <input type='password' name='cnfPass' placeholder='Confirm Password'><br><br>");
					out.print("<input type='Submit' value='Sign Up'><br><br>");
				out.print("</form>");
				
				out.print("<h3> <a href='Login.html'>Already Register?</a> </h3>");
				out.print("</center>");
			out.print("</body>");
			
		out.print("</html>");
		out.close();
		
		
	}

}
