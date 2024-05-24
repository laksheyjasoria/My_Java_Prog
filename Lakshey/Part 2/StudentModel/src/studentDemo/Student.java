package studentDemo;

import java.util.Scanner;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String email;
    private long phno;
    private String address;
	public Student(int id, String name, String email, long phno, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.address = address;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + ", address=" + address
				+ "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
    
}
