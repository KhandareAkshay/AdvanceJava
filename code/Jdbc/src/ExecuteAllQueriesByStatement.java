import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ExecuteAllQueriesByStatement {
	public static void main(String[] args) {
		// createTable();
		// insertEmp();
		selectEmp("test","asd' or 1='1");
	}

	public static void selectEmp(String name,String pass) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp where name='"+name+"' and password='"+pass+"'");
			while (rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("email") + "\t");
				System.out.print(rs.getString("password") + "\n");
			}
			System.out.println("Print All selected rows");
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void insertEmp() {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter Name : ");
			String name = scan.next();

			System.out.println("Enter Email : ");
			String email = scan.next();

			System.out.println("Enter Password : ");
			String password = scan.next();

			scan.close();

			int count = stmt.executeUpdate("insert into emp values('" + name + "','" + email + "','" + password + "')");

			System.out.println("Total Emp Created : " + count);
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void createTable() {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			stmt.executeUpdate("create table emp(name varchar(10), email varchar(20), password varchar(10))");
			System.out.println("Table Created....");
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sumit", "root");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}

}
