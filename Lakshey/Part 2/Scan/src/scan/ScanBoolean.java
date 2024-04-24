package scan;

import java.util.Scanner;

public class ScanBoolean {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter Boolean type data : ");
			boolean a = sc.nextBoolean();	
		System.out.println("your entered data is : "+a);
		sc.close();
		}
}
