package random;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string : ");
		String s1 = sc.nextLine();
		char [] a = s1.toCharArray();
		int sum=0,consective=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>=48&&a[i]<=56) {
				//
				sum+=(int) a[i]-48;
				//System.out.println((int) a[i]-48);
			}
			else if ((a[i]>=48&&a[i]<=56)&&(a[i-1]>=48&&a[i-1]<=56)&&i!=1) {
				consective=(consective*10)+((int) a[i]-48);
				sum+=consective;
			}
			else {
				consective=0;
			}
			//System.out.println(a[i]);
		}
		System.out.println(sum);
		
		sc.close();
	}
}
