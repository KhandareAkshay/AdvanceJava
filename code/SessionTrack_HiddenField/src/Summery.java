

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Summery extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("title");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String gender = request.getParameter("gender");
		
		String addLine1 = request.getParameter("add1");
		String addLine2 = request.getParameter("add2");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pin");
		
		String edu = request.getParameter("edu");
		String passingYear = request.getParameter("passingEdu");
		String percent = request.getParameter("percent");
		
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>User Edu Info</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<center>");
		out.print("<h3>User Information Print Preview</h3>");
		
		out.print("</center>");

		out.print("</body>");
		out.print("</html>");

		out.close();

	}

}
