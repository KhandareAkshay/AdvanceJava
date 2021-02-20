import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;

public class QuestionModel {

	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int saveQuestion() {
		int count = 0;
		Object[] data = {"What is java?","Wants to know about java Language", new Date()};
		count = template.update("insert into question values(0,?,?,?)", data);
		System.out.println(count + " : rows inserted..");
		return count;
	}
	
	public int saveQuestionByPreparedStmt() {
		int count = 0;
		PreparedStatementSetter stter = new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, "Why Java is used?");
				pstmt.setString(2, "Whic htype of application can be create by Java");
				pstmt.setDate(3, new java.sql.Date(new Date().getTime()));
			}
		};
		count = template.update("insert into question values(0,?,?,?)",stter);
		System.out.println(count + " : rows inserted..");
		return count;
	}
	
	public int updateQuestion(int id, String title) {
		int count = 0;
		Object[] data = {title, id};
		count = template.update("update question set title=? where id=?", data);
		System.out.println(count + " : rows updated..");
		return count;
	}
	
	public void getDataByResultSet() {
		
		ResultSetExtractor resultSetExtractor = new ResultSetExtractor() {
			@Override
			public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next()) {
					System.out.println("id : "+rs.getInt("Id"));
					System.out.println("Title : "+rs.getString(2));
					System.out.println("Desc : "+rs.getString(3));
					System.out.println("datetime : "+rs.getString(4));
				}
				return null;
			}
		};
		template.query("select * from question",resultSetExtractor);
	}
	
	public void getDataByFunction() {
		List list = template.queryForList("select * from question");
		System.out.println(list); 
	}

	
	public void getDataByBeanRowMapper() {
		List<Question> list = template.query("select * from question", new  BeanPropertyRowMapper(Question.class));
		for(Question q : list) {
			System.out.println(q.getId());
			System.out.println(q.getTitle());
			System.out.println(q.getDescribe());
			System.out.println(q.getCreatedOn());
		}
		
 
	}
	
	
}
