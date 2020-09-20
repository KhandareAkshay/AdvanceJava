import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class ExecuteByPreparedStatement {

	public static void main(String[] args) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sumit", "root");
			PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");

			for (int i = 1; i <= 1000; i++) {
				
				Scanner scan = new Scanner(System.in);

				System.out.println("Enter Name : ");
				String name = scan.next();

				System.out.println("Enter Email : ");
				String email = scan.next();

				System.out.println("Enter Password : ");
				String password = scan.next();

				scan.close();

				pst.setString(1, name);
				pst.setString(3, password);
				pst.setString(2, email);

				int count = pst.executeUpdate();
				System.out.println("Count : " + count);
			}

		
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
