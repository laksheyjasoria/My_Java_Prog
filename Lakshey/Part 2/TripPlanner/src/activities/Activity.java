package activities;

import java.util.Scanner;

import trip.Delhi;
import trip.Dhosi;
import trip.Goa;
//import trip.Haridwar;
import trip.Jaipur;
import trip.Ladakh;
//import trip.Manali;
import trip.Rishikesh;
import trip.Sonipat;

public class Activity {

	public static void byActivity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***Welcome To Trip Planner Activities***");
		System.out.println("Plan a trip on basis of below options");
		System.out.println("1 -> Trekking");
		System.out.println("2 -> Beach");
		System.out.println("3 -> Dj Night");
		System.out.println("4 -> Monuments");
		System.out.println("5 -> Snow");
		System.out.println("6 -> Mountain");
		System.out.println("7 -> Religious");
		System.out.println("8 -> Bike Ride");
		System.out.println("9 -> Adventure Park");
		System.out.println("10 -> Adventurous Activities");
        int select = sc.nextInt();
        switch (select) {
		case 1:
			// rishikesh,haridwar,dhosihills,sonipat,mathuravrindavsn
			Rishikesh.trip();
			Dhosi.trip();
			break;

		case 2:
			//goa
			Goa.trip();
			break;

		case 3:
			//goa
			Goa.trip();
			break;

		case 4:
			//jaipur
			Jaipur.trip();
			break;

		case 5:
			//manali
			//Manali.trip();
			break;

		case 6:
			//rishikesh,dhosi
			Rishikesh.trip();
			Dhosi.trip();
			break;

		case 7:
			//sonipat,haridwar,rishikesh,dhosi
			Sonipat.trip();
			//Haridwar.trip();
			Rishikesh.trip();
			Dhosi.trip();
			break;

		case 8:
			//ladakh
			Ladakh.trip();
			break;

		case 9:
			//sonipat,delhi
			Sonipat.trip();
			Delhi.trip();
			break;

		case 10:
			//rishikesh,sonipat
			Sonipat.trip();
			Rishikesh.trip();
			break;
		default:
			break;
		}
        sc.close();
	}
}
