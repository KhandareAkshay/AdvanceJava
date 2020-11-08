

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Operations extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n1= request.getParameter("num1");
		float number1 = Float.parseFloat(n1);
		float number2 = Float.parseFloat(request.getParameter("num2"));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Operation for "+number1+" and "+number2+"</h1>");
		
		
		out.print("<h3>Add =  "+(number1+number2)+"</h3>");
		
		out.print("<h3>Sub =  "+(number1-number2)+"</h3>");
		
		out.print("<h3>Mul =  "+(number1*number2)+"</h3>");
		
		out.print("<h3>Div =  "+(number1/number2)+"</h3>");
		
		
		
		out.close();
		
	}

}
