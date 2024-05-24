package Ques;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char [] a = s1.toCharArray();
		for (char c : a) {
			System.out.println(true? "dfg" : "esdf");
		}
		sc.close();
	}
}
