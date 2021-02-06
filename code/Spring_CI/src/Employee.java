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
	private Map<String,String> address;
	private Properties empData;

	public Employee(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Employee(int id, String name, String email, List<String> contact, Set<String> skills,
			Map<String, String> address, Properties empData) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.skills = skills;
		this.address = address;
		this.empData = empData;
	}
	
	public Map<String, String> getAddress() {
		return address;
	}
	
	public List<String> getContact() {
		return contact;
	}

	public Properties getEmpData() {
		return empData;
	}
	
	public Set<String> getSkills() {
		return skills;
	}
	
	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
