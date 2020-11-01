

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegisterValidation implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Pre process");//pre process code
		
		
		chain.doFilter(request, response);// forward request to the next/actual page
		
		
		
		System.out.println("Post process");// post process code
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
