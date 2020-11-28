

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

public class TaskValidationFilter implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String title = req.getParameter("title");
		String desc = req.getParameter("titleDesc");
		String date = req.getParameter("titleDate");
		
		ArrayList<String> errorList =new ArrayList<>();
		
		if(title==null || title.isEmpty()){
			errorList.add("Task Title cannont be null or empty");
		}
		
		if(desc==null || desc.isEmpty()){
			errorList.add("Task Desciption cannont be null or empty");
		}
		
		if(date==null || date.isEmpty()){
			errorList.add("Task date cannont be null or empty");
		}
		
		
		if(errorList.isEmpty()){
			chain.doFilter(request, response);//to continue with normal flow.
		}else{
			RequestDispatcher dis = req.getRequestDispatcher("AddTask");
			req.setAttribute("ers", errorList);
			dis.forward(req, res);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
