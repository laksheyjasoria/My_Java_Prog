package plan;

import java.util.Scanner;
import trip.*;
public class Plans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("***Welcome To Trip Planner Planner***");
		//System.out.println("Plan a trip on basis of below options");
		System.out.println("1 -> Jaipur");
		System.out.println("2 -> Manali");
		System.out.println("3 -> Haridwar");
		System.out.println("4 -> Rishikesh");
		System.out.println("5 -> Dhosi Hills");
		System.out.println("6 -> Sonipat");
		System.out.println("7 -> Goa");
		System.out.println("8 -> Ladakh");
		System.out.println("9 -> Delhi");
		System.out.print("Enter Option : ");
        int select = sc.nextInt();
        switch (select) {
		case 1:
			Jaipur.trip();
			break;

		case 2:
			
			break;

		case 3:
			
			break;

		case 4:
			
			break;

		case 5:
			
			break;

		case 6:
			
			break;

		case 7:
			
			break;

		case 8:
			
			break;

		case 9:
			
			break;

		default:
			break;
		}
        sc.close();
	}
}
