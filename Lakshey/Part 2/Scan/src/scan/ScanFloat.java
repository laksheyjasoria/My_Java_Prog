package scan;

import java.util.Scanner;

public class ScanFloat {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter Float type data : ");
			float a = sc.nextFloat();	
		System.out.println("your entered data is : "+a);
		sc.close();
		}
}
