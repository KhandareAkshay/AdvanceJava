import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteByStatement {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // register driver
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sumit", "root");//create connection
			Statement stmt= conn.createStatement();//create statement
			int count=stmt.executeUpdate("insert into student values('Abc','abc@gmail.com',7755441122)");//execute statement
			System.out.println("Count : "+count);
			conn.close();//close connection
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
