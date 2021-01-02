package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class StudentModel {
	
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb","root","root");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public int save(Student student) {
		int count = 0;
		try {
			Connection con = getConnection();
			String query = "insert into student values(0,?,?,?,?)";
			PreparedStatement pstm = con.prepareStatement(query);
			
			pstm.setString(1, student.getName());
			pstm.setString(2, student.getEmail());
			pstm.setString(3, student.getPassword());
			pstm.setString(4, student.getContact());
			
			count = pstm.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	
	public List<Student> getStudent(){
		List<Student> listOfStudent = new ArrayList<>();
		try {
			Connection con = getConnection();
			String query = "select * from student";
			PreparedStatement pstm = con.prepareStatement(query);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				Student stud = new Student();
				stud.setId(rs.getInt("id"));
				stud.setName(rs.getString("name"));
				stud.setEmail(rs.getString("email"));
				stud.setPassword(rs.getString("password"));
				stud.setContact(rs.getString("contact"));
				listOfStudent.add(stud);
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listOfStudent;
	}
	
	
}
