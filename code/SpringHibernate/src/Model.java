import org.springframework.orm.hibernate3.HibernateTemplate;

public class Model {

	HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void save(User user) {
		hibernateTemplate.save(user);
	}
}
