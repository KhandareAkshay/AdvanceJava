import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectByPreparedStmt {

	public static void main(String[] args) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sumit", "root");
			
			PreparedStatement pst = con.prepareStatement("select * from emp");

			ResultSet rs= pst.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("email")+"\n");
			}
		
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
