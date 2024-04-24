package construct;

public class Student {
    String name;
    int id;
	public Student(String name) {
		this.name=name;
	}
	public Student(int id) {
		this.id=id;
	}
	public Student(String name, int id) {
		this(name);
		this.id=id;
	}

	public void printDetails() {
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println();
	}
	public static void main(String[] args) {
//		Student s1=new Student(1);
//		s1.printDetails();
//		Student s2=new Student("Lucky");
//		s2.printDetails();
//		Student s3=new Student("Lakshey",22);
//		s3.printDetails();
		//s1.printDetails();
		Student [] batch =  new Student[10];
        batch[0] = new Student("Pritee", 1);
        batch[1] = new Student("Lucky", 2);
        batch[2] = new Student("Lakshey", 3);
        batch[3] = new Student("Nikku", 4);
        batch[4] = new Student("Nikki", 5);
        batch[5] = new Student("Pushpa",6);
        batch[6] = new Student("Pushpa");     
        batch[7] = new Student(8);
		for (int i = 0; i < 8; i++) {
			 batch[i].printDetails();		
		}

	
}}
