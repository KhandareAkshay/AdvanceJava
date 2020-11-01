

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterUserService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection conn=null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletDB","root","root");
			System.out.println("Connection Created from RegisterUserService");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String cnfPassword = request.getParameter("cnfPass");
		try {
			PreparedStatement pst=conn.prepareStatement("insert into register values(?,?,?,?)");
				pst.setString(1, email);
				pst.setString(2, name);
				pst.setString(3, password);
				pst.setString(4, cnfPassword);
			
			int count = pst.executeUpdate();
			if(count>0) {
				//success
				System.out.println("Data Insertion success");
				response.sendRedirect("Login.html");
			}else {
				//fail
				System.out.println("Data Insertion Fail");
				response.sendRedirect("Register?code=2");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
			response.sendRedirect("Register?code=2");
		}	
	}
	
	@Override
	public void destroy() {
		try {
			conn.close();
			System.out.println("Connection closed from RegisterUserService");
		}catch(Exception ex) {
			ex.printStackTrace();
		}	
	}

}

