package scan;

import java.util.Scanner;

public class ScanString1 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter String type data : ");
			String a = sc.nextLine();	
		System.out.println("your entered data is : "+a);
		sc.close();
		}
}
