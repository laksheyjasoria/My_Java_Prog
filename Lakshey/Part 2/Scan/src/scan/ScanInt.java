package scan;

import java.util.Scanner;

public class ScanInt {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter Int type data");
		int a = sc.nextInt();	
	System.out.println("your entered data is : "+a);
	sc.close();
	}
}
