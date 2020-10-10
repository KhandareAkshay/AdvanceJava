import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondPage extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is from Second Servlet");
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.print("Hello Serlvet");
		
		
		out.print("<h1 style='color:'red';'>Hello Serlvet</h1>");
	}
}
