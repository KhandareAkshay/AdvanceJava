package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import model.StudentModel;

public class StudentRegisterController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String contact = request.getParameter("contact");
		
		Student student = new Student();
		student.setName(name);
		student.setEmail(email);
		student.setPassword(password);
		student.setContact(contact);
		
		StudentModel model = new StudentModel();
		int count = model.save(student);
		
		String msg ="Registration  Fail..";
		
		if(count>0) {
			msg = "Registration Successful...";
		}
		
		response.sendRedirect("StudRegister.jsp?msg="+msg);
		
		
		
	}

}
