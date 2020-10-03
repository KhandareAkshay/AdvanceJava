import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ExecuteSelectQuery {

	public static void main(String[] args) {
		try {

			// 1. Register/load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sumit", "root");
			// con.getMetaData()//info related to ur Data Base
			// 3. Create statement
			PreparedStatement stmt = con.prepareStatement("select name, email from emp");
			// 4. execute statement
			ResultSet rs = stmt.executeQuery();
			/*
			 * ResultSetMetaData metaData = stmt.getMetaData();//info of selected records
			 * System.out.println(metaData.getColumnCount());
			 * System.out.println(metaData.getColumnName(1));
			 * System.out.println(metaData.getColumnTypeName(1));
			 */

			while (rs.next()) {
				String nameVal = rs.getString("NAME");
				String emailVal = rs.getString("email");
				System.out.println("name : "+nameVal+" Email : " + emailVal);
			}

			// 5. close connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
