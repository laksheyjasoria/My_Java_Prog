package scan;

import java.util.Scanner;

public class ScanLong {
 
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter Long type data : ");
			long a = sc.nextLong();	
		System.out.println("your entered data is : "+a);
		sc.close();
		}
}
