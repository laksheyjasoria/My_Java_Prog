package programing16;

import java.util.Scanner;

public class Armstrong {

	public static int countDig(int num) {
		
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		return count;
	}
	public static void check(int num) {
		int chk=num;
		int sum=0;
		int pow = countDig(num);
		while(num>0) {
			sum+=Math.pow(num%10, pow);
			num/=10;
		}
		if (sum==chk) {
			System.out.println("yes");
		} else {
System.out.println("no");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no to check it is armstrong or not ");
		int num = sc.nextInt();
	    check(num);	
	    sc.close();
	}
}