

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstPage extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init from servlet");
	}

	
	public void destroy() {
		System.out.println("destroy from servlet");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is from First Servlet");
	}

}
