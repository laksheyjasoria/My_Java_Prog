package student;

import student.Student;
public class Driver {

	public static void main(String[] args) {
		Student s1= new Student("Lucky", 7206169908l, 87.5);
		System.out.println(s1.getCollege_name());
		System.out.println(s1.getMarks());
		System.out.println(s1.getName());
		System.out.println(s1.getPhno());
		System.out.println(s1.getRoll());
//		System.out.println(s1.getAadhaar());
		Student s2= new Student("Lucky1", 7206169908l, 87.5);
		System.out.println(s2.getCollege_name());
		System.out.println(s2.getMarks());
		System.out.println(s2.getName());
		System.out.println(s2.getPhno());
		System.out.println(s2.getRoll());
//		System.out.println(s2.getAadhaar());
	}
}