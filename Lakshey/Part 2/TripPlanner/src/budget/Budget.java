package budget;

import java.util.Scanner;
import trip.*;
public class Budget {

	
	public static void byBudget() {
		Scanner sc = new Scanner(System.in);
		//System.out.println("***Welcome To Trip Planner Planner***");
		System.out.println("Budget  per person on the trip");
		System.out.println("1 -> 500 - 2000");
		System.out.println("2 -> 2000 - 4000");
		System.out.println("3 -> 2500 - 5000");
		System.out.println("4 -> 5000 - 10000");
		System.out.println("5 -> 10000 - 15000");
		System.out.println("6 -> 15000 - 20000");
		System.out.println("7 -> 20000 - 30000");
		System.out.println("These budget can vary as per the person");
		System.out.print("Enter Option : ");
        int select = sc.nextInt();
        switch (select) {
		case 1:
			Dhosi.trip();
			break;

		case 2:
			Sonipat.trip();
			break;

		case 3:
			Delhi.trip();
			break;

		case 4:
			Jaipur.trip();
			MathuraVrindavan.trip();
			Udaipur.trip();
			//Haridwar.trip;
			break;
		
		case 5:
			Rishikesh.trip();
			break;
		case 6:
			//Manali.trip;
			Goa.trip();
			break;
        case 7:
			Ladakh.trip();
			break;

		default:
			break;
		}
  sc.close();
	}
}
