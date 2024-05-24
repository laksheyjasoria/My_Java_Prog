package exceptionHandling;

import java.util.Scanner;

public class NumberFormatExc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 ;
		s1=sc.nextLine();
		Integer a = Integer.parseInt(s1);
		sc.close();
	}
}
