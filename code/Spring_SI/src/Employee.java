import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private String email;
	
	private List<String> contact;
	private Set<String> skills;
	private Map<String, String> address;
	private Properties empData;
	
	
	public Properties getEmpData() {
		return empData;
	}
	public void setEmpData(Properties empData) {
		this.empData = empData;
	}
	public void setContact(List<String> contact) {
		this.contact = contact;
	}
	public List<String> getContact() {
		return contact;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
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
