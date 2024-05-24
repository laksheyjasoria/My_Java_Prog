package scan;

import java.util.Scanner;

public class ScanDouble {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter Double type data : ");
			double a = sc.nextDouble();	
		System.out.println("your entered data is : "+a);
		sc.close();
		}
}
