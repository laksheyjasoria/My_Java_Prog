package scan;

import java.util.Scanner;

public class ScanChar {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter String type data : ");
			char a = sc.next().charAt(0);	
		System.out.println("your entered data is : "+a);
		sc.close();
		}
}
