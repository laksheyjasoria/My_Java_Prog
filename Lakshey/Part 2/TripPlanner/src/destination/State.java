package destination;

import java.util.Scanner;

import trip.*;

public class State {

	public static void byState() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Welcome To Trip Planner ***");
		System.out.println("Plan a trip on basis of below Destination");
		System.out.println("1 -> Uttarakhand");
		System.out.println("2 -> Himachal Pradesh");
		System.out.println("3 -> Jammu and Kashmir");
		System.out.println("4 -> Delhi");
		System.out.println("5 -> Goa");
		System.out.println("6 -> Haryana");
		System.out.println("7 -> Rajasthan");
		System.out.println("8 -> Uttar Pradesh");
        int select = sc.nextInt();
        switch (select) {
		case 1:
			//Haridwar.trip;
			Rishikesh.trip();
			break;

		case 2:
			Ladakh.trip();
			break;

		case 3:
			//Manali.trip();
			break;

		case 4:
			Delhi.trip();
			break;

		case 5:
			Goa.trip();
			break;

		case 6:
			Dhosi.trip();
			Sonipat.trip();
			break;
		case 7:
			Dhosi.trip();
			Jaipur.trip();
			Udaipur.trip();
			break;
		case 8:
			MathuraVrindavan.trip();
			break;

		default:
			break;
		}
        sc.close();
	}
}
