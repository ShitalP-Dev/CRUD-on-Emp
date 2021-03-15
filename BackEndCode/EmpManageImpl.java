package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpManageImpl implements EmpManager{

	@Autowired
	EmpDao edao;
	@Override
	public void addEmp(Emp a) {
		edao.addEmp(a);
		
	}

	@Override
	public List<Emp> getEmps() {
		return edao.getEmps();
	}

	@Override
	public void delete(int id) {
		edao.delete(id);
	}

	@Override
	public void update(Emp p, int id) {
		edao.update(p, id);
	}

	@Override
	public Emp getEmp(int id) {
		return edao.getEmp(id);
	}

}
