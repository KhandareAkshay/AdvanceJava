import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ExecuteProcedure {

	public static void main(String[] args) {
		try {
			PropertiesLoader loader=new PropertiesLoader();
			Class.forName(loader.getValues("driver"));
			Connection conn= DriverManager.getConnection(loader.getValues("url"),loader.getValues("username"),loader.getValues("password"));
			
			CallableStatement stmt= conn.prepareCall("{call insertemp(?,?,?)}");
			
			stmt.setString(1, "pro1@gmail.com");
			stmt.setString(2, "pro1");
			stmt.setString(3, "pro123");
			
			
			stmt.executeUpdate();
			
			System.out.println("Execute Successfully");
			
			conn.close();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}


