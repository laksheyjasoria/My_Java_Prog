package scan;

import java.util.Scanner;

public class ScanShort {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter Short type data : ");
			short a = sc.nextShort();	
		System.out.println("your entered data is : "+a);
		sc.close();
		}
}
