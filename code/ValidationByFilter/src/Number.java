

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Number extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>Basic Calculator</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<center>");
				out.print("<h2>Provide Number</h2>");
				
				ArrayList<String> list = (ArrayList<String>)request.getAttribute("err");
				
				if(list != null) {
					for(String s : list) {
						out.print("<font color = 'red'> " + s + "</font><br>");
					} 
				}
				
				
				out.print("<form action='Operations'>");
					out.print("Enter 1st Number<font color = 'red'><sup>*</sup></font>  <input type='text' name='num1'><br><br>");
					out.print("Enter 2nd Number<font color = 'red'><sup>*</sup></font> <input type='text' name='num2'><br><br>");
					out.print("<input type='Submit' value='Operations'><br><br>");
				out.print("</form>");

				out.print("</center>");
			out.print("</body>");
			
		out.print("</html>");
		out.close();
	}

}
