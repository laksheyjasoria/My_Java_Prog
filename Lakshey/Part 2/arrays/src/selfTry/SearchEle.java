package selfTry;

import java.util.Scanner;

public class SearchEle {

	public static boolean search(int a [],int element) {
		boolean result = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==element) {
				result = true;
				break;
			}
		}
		return result;
	}
	public static float sum(int a []) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+= a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int a [] = {1,2,3,4};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the element you want to search in the given array : ");
		int element = scanner.nextInt();
		System.out.println(search(a,element)?"Element is present in the array":"Element is not present in the array");
		scanner.close();
	}
}
