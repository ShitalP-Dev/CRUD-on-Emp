package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="emp", catalog="mydb")
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
private int id;
	@Column(name="ename")
private String ename;
	@Column(name="gender")
private String gender;
	@Column(name="annualSalary")
private int annualSalary;
	@Column(name="dateOfBirth")
private String dateOfBirth;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int id, String ename, String gender, int annualSalary, String dateOfBirth) {
	super();
	this.id = id;
	this.ename = ename;
	this.gender = gender;
	this.annualSalary = annualSalary;
	this.dateOfBirth = dateOfBirth;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAnnualSalary() {
	return annualSalary;
}
public void setAnnualSalary(int annualSalary) {
	this.annualSalary = annualSalary;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}


}
