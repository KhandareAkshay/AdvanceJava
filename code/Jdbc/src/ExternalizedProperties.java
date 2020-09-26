import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExternalizedProperties {

	public static void main(String[] args) {
		
		try {
			PropertiesLoader loader=new PropertiesLoader();
			Class.forName(loader.getValues("driver"));
			Connection conn= DriverManager.getConnection(loader.getValues("url"),loader.getValues("username"),loader.getValues("password"));
			PreparedStatement stmt=conn.prepareStatement(loader.getValues("select.query"));
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("email")+"\n");
			}
			conn.close();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
