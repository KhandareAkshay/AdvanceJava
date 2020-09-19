import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static void main(String[] args) {
		try {
			//==============Oracle================
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection oracleCon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sumit", "root");
			
			System.out.println("Oracle Connection Successful....");
			
			//==============Mysql================
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection mySqlcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			
			System.out.println("Mysql Connection Successful....");	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
