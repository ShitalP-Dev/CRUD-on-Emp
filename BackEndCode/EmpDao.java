package mypack;

import java.util.List;

public interface EmpDao {
	public void addEmp(Emp a);
	public List<Emp> getEmps();
	void delete(int id);
	void update(Emp p,int id);
	Emp getEmp(int id);
}
