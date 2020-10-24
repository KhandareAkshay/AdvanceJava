

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Success extends HttpServlet {
	PrintWriter fileWrite=null;
	@Override
	public void init() throws ServletException {
		try {
			fileWrite=new PrintWriter(new File("F:\\RSSoftTech\\AdvanceJava18Sept\\sample_html\\email.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("nm");
		String emailId = request.getParameter("e");
		
		
		//validation
		
		
		out.print("<h1>Thank You "+name+", For your Subscription.... </h1>");
		
		out.print("<h3>Your Email Id is : "+emailId+" </h3>");
		
		
		fileWrite.append(emailId);
		fileWrite.flush();
		
	}
	
	@Override
	public void destroy() {
		fileWrite.close();
	}

}
