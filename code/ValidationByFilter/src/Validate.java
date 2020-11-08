

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate implements Filter {
	public void destroy() {
	}
	public void init(FilterConfig fConfig) throws ServletException {	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String n1= req.getParameter("num1");
		String n2= req.getParameter("num2");
		
		ArrayList<String> errorList=new ArrayList<String>();
		
		if( n1==null || n1.isEmpty()) {
			errorList.add("Number1 is mandatory");
		}
		if(n2==null || n2.isEmpty()) {
			errorList.add("Number2 is mandatory");
		}
		
		if(errorList.isEmpty()) {
			chain.doFilter(request, response);//go to next
		}else {
			//res.sendRedirect("Number");
			RequestDispatcher dis = req.getRequestDispatcher("Number");
			req.setAttribute("err", errorList);
			dis.forward(req, res);
			
		}
		
		
		
		
	}


	

}
