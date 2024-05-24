package studentDemo;

import java.util.HashMap;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
		
		byte ch=0,ch2=0;
		do{
		System.out.print("Enter the first name : ");
		String fname = sc.next();
		System.out.println();
		System.out.print("Enter the last name : ");
		String lname = sc.next();
		String name= fname+" "+lname;
		System.out.println();
		System.out.print("Enter the id : ");
		int id = sc.nextInt();
		System.out.println();
		System.out.print("Enter the email : ");
		String email = sc.next();
		System.out.println();
		System.out.print("Enter the phno : ");
		long phno = sc.nextLong();
		System.out.println();
		sc.nextLine();
		System.out.print("Enter the address : ");
		String address = sc.nextLine();
		System.out.println();
		Student s1 = new Student(id, name , email, phno, address);
		hm.put(id, s1);
		System.out.println("Do you want to add more student, then press 1 else 0");
		ch=sc.nextByte();
	}while(ch==1);
		
		
		System.out.println("=== Now you can retrieve Student data by their id ===");
		do {
			System.out.print("Enter the id :");
			int a = sc.nextInt();
			if(hm.get(a)!=null) {
			Student retrieve= hm.get(a);
			System.out.println("Name : "+retrieve.getName());
			}else {
				System.out.println("This id is not present");
			}
			System.out.println();
			System.out.println("Do you want to get more student details, then press 1 else 0");
			ch2=sc.nextByte();
		}while(ch2==1);
	
		
	}
}
