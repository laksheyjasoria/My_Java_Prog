package college;

public class Semester extends Internal {

	public Semester(String branch, String name, double marks1, double marks2) {
		super(branch, name, marks1, marks2);
		
	}
	public static void main(String[] args) {
		Semester sem = new Semester("CSE", "Lucky", 78, 89);
				sem.sumMark();
				sem.displayDetails();
	}
	void sumMark() {
		System.out.println("Sum : "+(this.marks1+this.marks2));
	}
	void displayDetails() {
		System.out.println("Name : "+this.name);
		System.out.println("College Name : "+this.cname);
		System.out.println("Branch : "+this.branch);
		System.out.println("Marks1 : "+this.marks1);
		System.out.println("Marks2 : "+this.marks2);
	}

}