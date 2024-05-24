package exceptionHandling;

import java.util.Scanner;

public class InputMisMatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		scanner.close();
	}
}
