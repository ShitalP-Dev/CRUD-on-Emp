package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpManager manager;
	
	@PostMapping(value = "/getOne", headers = "Accept=application/json")  
	 public void addEmp(@RequestBody Emp p)
	 {
		manager.addEmp(p);
	 }
	
	@GetMapping(value = "/getall",headers = "Accept=application/json")  
	 public String showEmps()
	 {
		  return new Gson().toJson(manager.getEmps());
	 }
	@GetMapping(value = "/{pid}", headers = "Accept=application/json")  
	 public Emp getPro(@PathVariable int pid)
	 {
		Emp p=manager.getEmp(pid);
		return p;
	 }
	@DeleteMapping(value = "/{pid}", headers = "Accept=application/json")  
	 public void removeEmp(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	@PutMapping(value = "/{pid}",headers = "Accept=application/json")  
	 public void updateEmp(@RequestBody Emp p,@PathVariable int pid)
	 {
		manager.update(p,pid);
	 }

}
