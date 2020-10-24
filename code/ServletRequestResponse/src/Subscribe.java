

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Subscribe extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");//to decide which type type of response wants to sent client(MIME type)
		PrintWriter pw = response.getWriter();
		
		pw.write("<html>");
		pw.write("<head>");
			pw.write("<title>Subscription Page</title>");
		pw.write("</head>");
		
		pw.write("<body>");
			pw.write("<form action='succSubs'>");
				pw.write("Name : <input type='text' name='nm'><br>");
				pw.write("Email : <input type='text' name='e'><br>");
				pw.write("<input type='submit' value='Subscribe'><br>");
			pw.write("</form>");
		pw.write("<body>");
		
		pw.write("</html>");
		
	}

}