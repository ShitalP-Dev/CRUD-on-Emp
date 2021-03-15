package mypack;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public class EmpDaoImpl implements EmpDao {
	
	@Autowired
	HibernateTemplate template;

	@Override
	public void addEmp(Emp a) {
		template.save(a);
		
	}

	@Override
	public List<Emp> getEmps() {
		List<Emp> list=(List<Emp>) template.find("from Emp e");
		return list;
	}

	@Override
	public void delete(int id) {
		template.delete(template.get(Emp.class, id));
		
	}

	@Override
	public void update(Emp p, int id) {
		template.bulkUpdate("update Emp p set p.ename1=?, p.gender=?,p.annualSalary=?,p.dateOfBirth=? where p.id=?",
				p.getEname(),p.getGender(),p.getAnnualSalary(),p.getDateOfBirth(),id);
		template.update(template.get(Emp.class, id));
	}

	@Override
	public Emp getEmp(int id) {
		Emp temp=(Emp)template.find("from Emp p where p.id=?",id).get(0);
		return temp;
	}

}
