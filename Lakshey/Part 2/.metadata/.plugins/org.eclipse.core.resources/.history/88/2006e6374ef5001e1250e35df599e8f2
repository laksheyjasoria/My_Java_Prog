package main;

import java.util.Scanner;
import activities.*;
import budget.*;
import stay.*;
import destination.*;
public class TripPlanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Welcome To Trip Planner ***");
		System.out.println("Plan a trip on basis of below options");
		System.out.println("1 -> Budget");
		System.out.println("2 -> Stay");
		System.out.println("3 -> Destination");
		System.out.println("4 -> Activities");
        int select = sc.nextInt();
        switch (select) {
		case 1:
			Budget.byBudget();
			break;

		case 2:
			Stay.byStay();
			break;

		case 3:
			State.byState();
			break;

		case 4:
			Activity.byActivity();
			break;

		default:
			break;
		}
        sc.close();
	}
}
