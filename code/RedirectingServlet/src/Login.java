

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String code = request.getParameter("code");
		
		out.print("<html>");
		
		out.print("<head>");
			out.print("<title>Member Login</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<center>");
		out.print("<h2>Member Login</h2>");
		
		if(code!=null && "5".equals(code)) {
			out.print("<font color='red'><span>Invalid Email or Password..</span></font>");
		}
		
		
			out.print("<form action='authUser' method='post'>");
				out.print("Email : <input type='text' name ='userEmail'/></br></br>");
				out.print("Password : <input type='password' name ='userPass'/></br></br>");
				out.print("<input type='submit' value ='Login'/></br></br>");
				out.print("<a href='#'> New User.?</a>");
				out.print(" || <a href='#'> Forgot Password.?</a><br></br>");
			out.print("</form>");
			out.print("</center>");
		out.print("</body>");
		
		
		out.print("</html>");
		
		out.close();
		
		
	}

}
