import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//@NamedQuery(name="updateStudentEmail",query="update Student set email=:e where id=:i")
@NamedQueries(value ={
		@NamedQuery(name="updateStudentEmail",query="update Student set email=:e where id=:i"),
		@NamedQuery(name="selectAllStudent",query="from Student")
})
@Entity
@Table(name = "studinfo")
public class Student {
	@Id
	@Column(name = "studid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@Column(length = 50, unique = true)
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
