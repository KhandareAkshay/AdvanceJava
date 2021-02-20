import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class EmpProfileManage {

	HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void save(EmployeeProfile profile) {
		hibernateTemplate.save(profile);
		//System.out.println(10/0);
	}
	
	@Transactional
	public void update(EmployeeProfile profile) {
		hibernateTemplate.update(profile);
	}
	
	@Transactional
	public void delete(EmployeeProfile profile) {
		hibernateTemplate.delete(profile);
	}
	
	@Transactional
	public void select() {
		List<EmployeeProfile> list= (List<EmployeeProfile>) hibernateTemplate.find("from EmployeeProfile");
		for(EmployeeProfile emp : list) {
			System.out.print(emp.getName()+"\t");
			System.out.print(emp.getContact()+"\t");
			System.out.print(emp.getEmail()+"\n");
		}
	}
	
}
