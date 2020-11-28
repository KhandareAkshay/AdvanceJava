import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TaskService {
	
	//insert task
	public boolean save(String title,String desc,String date){
		boolean result=false;
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todoapp","root","root");
			PreparedStatement pstm = con.prepareStatement("insert into task values(0,?,?,?,'Open')");
			pstm.setString(1, title);
			pstm.setString(2, desc);
			pstm.setString(3, date);
			
			int count = pstm.executeUpdate();
			
			if(count>0){
				result = true;
			}
			
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	
	//select task
	
	//update task
	
	
}
