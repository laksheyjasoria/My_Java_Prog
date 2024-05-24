package emp;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
public class Employee {

	private String ename;
	private double salary;
	private int eid;
	private String cname = "Lakshey Tech Solution";
	private  LocalDateTime joining_date = LocalDateTime.now();  

	public Employee(String ename, double salary, int eid) {
		this.ename = ename;
		this.salary = salary;
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public int getEid() {
		return eid;
	}
	public String getCname() {
		return cname;
	}
	public String getJoining_date() {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		return dtf.format(joining_date).toString();
	}
	
}
