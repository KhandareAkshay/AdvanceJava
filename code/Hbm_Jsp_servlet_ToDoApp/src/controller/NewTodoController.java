package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Todo;
import entity.User;
import model.ToDoModel;

public class NewTodoController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String detail = request.getParameter("detail");
		String taskdate = request.getParameter("taskdate");
		
		Todo todo = new Todo();
		todo.setTitle(title);
		todo.setDetail(detail);
		todo.setState("Open");
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		try {
			todo.setTitledate(sdf.parse(taskdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		User user = new User();
		user.setId(1); // in future get this ID from session
		
		todo.setUid(user);
		
		
		ToDoModel toDoModel = new ToDoModel();
		
		int id = toDoModel.createTodo(todo);
		
		if(id>0){
			response.sendRedirect("NewTodo.jsp?msg=Task Created Successfully, Task Id : "+id);
		}else{
			response.sendRedirect("NewTodo.jsp?msg=Task creation fail, Try after sometime..");
		}
		
		
	}

}
