package stay;

import java.util.Scanner;

import trip.*;


public class Stay {

	public static void byStay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***Welcome To Trip Planner Planner***");
		System.out.println("Choose the staying Period");
		System.out.println("1 -> 1D");
		System.out.println("2 -> 2D1N");
		System.out.println("3 -> 2D2N");
		System.out.println("4 -> 3D2N");
		System.out.println("5 -> 4D3N");
		System.out.println("6 -> 4D4N");
		System.out.println("7 -> 5D4N");
		System.out.println("8 -> 1 Month");
		System.out.print("Enter Option : ");
        int select = sc.nextInt();
        switch (select) {
		case 1:
			Dhosi.trip();
			break;

		case 2:
			Jaipur.trip();
			break;

		case 3:
			MathuraVrindavan.trip();
			break;

		case 4:
			//Haridwar.trip();
			break;

		case 5:
			Rishikesh.trip();
			break;

		case 6:
			Delhi.trip();
			Goa.trip();
			break;

		case 7:
			//Manali.trip();
			break;

		case 8:
			Ladakh.trip();
			break;

		case 9:
			
			break;
			
		default:
			break;
		}
        sc.close();
	}
}
