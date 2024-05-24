package scan;

import java.util.Scanner;

public class ScanByte {
	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
			System.out.print("Enter Byte type data : ");
			byte a = s.nextByte();	
			System.out.println();
		System.out.println("your entered data is : "+a);
		s.close();
		}
}
