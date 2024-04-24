package tracingProg;


public class Student {

	String name;
	int roll;
	static String cname="JSP";
	public Student() {
		System.out.println("Account is created and data is not updated");
	}
	Student(int r){
		System.out.println("Account is created and roll is updated");
	}
	Student(String name){
		System.out.println("Account is created and name is updated");
	}
	Student(String name,int r){
		System.out.println("Account is created and name and roll is updated");
	}
	public void printDetails() {
		System.out.println(name);
		System.out.println(roll);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
	    s1.printDetails();
	    Student s2 = new Student(5);
	    s2.printDetails();
	    Student s3 = new Student("Devilal");
	    s3.printDetails();
	    Student s4= new Student("Dev",5);
	    s4.printDetails();
	    Student s5 = new Student("Devi",7);
	    s5.printDetails();
	}
}
