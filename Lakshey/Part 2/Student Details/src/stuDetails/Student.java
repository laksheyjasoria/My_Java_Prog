package stuDetails;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter  First Name : ");
		String firstname = scanner.next();
		System.out.println();
		System.out.print("Enter Your Last Name : ");
		String lastname = scanner.next();
		System.out.println();
		System.out.print("Enter Your Email : ");
		String email = scanner.next();
		System.out.println();
		System.out.print("Enter Your Phone No : ");
		long phno = scanner.nextLong();
		System.out.println();
		System.out.print("Enter Your City Name : ");
		String city = scanner.next();
		System.out.println();
		System.out.print("Enter Your District Name : ");
		String district = scanner.next();
		System.out.println();
		System.out.print("Enter Your State Name : ");
		String state = scanner.next();
		System.out.println("Name : "+firstname+" "+lastname+", Email : "+email+", Phno : "+phno+", Adress :"+state+" "+district+" "+city);
		scanner.close();
	}
}
