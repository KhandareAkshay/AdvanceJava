package model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import entity.Todo;

public class ToDoModel {

	public int createTodo(Todo todo){
		int id = 0;
		
		Configuration config = new AnnotationConfiguration();
		config.configure("hibernate-cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		id = (int)session.save(todo);
		
		tr.commit();
		session.close();
		sf.close();
		
		return id;
	}
	
	
	public List<Todo> getAllTodo(int userId){
		
		Configuration config = new AnnotationConfiguration();
		config.configure("hibernate-cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();


		Query query =  session.createQuery("select * from Todo where uid=?");
		query.setInteger(0, userId);
		List<Todo> listOfTask = query.list();
		
		
		tr.commit();
		session.close();
		sf.close();
		
		return listOfTask;
	}
}
