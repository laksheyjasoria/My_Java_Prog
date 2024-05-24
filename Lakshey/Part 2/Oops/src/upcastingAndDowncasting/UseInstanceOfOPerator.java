package upcastingAndDowncasting;

import java.util.Scanner;


public class UseInstanceOfOPerator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Vechile v;
		System.out.println("From which type of vechile you want to travel ");
		System.out.println("Press 1 for Bike ");
		System.out.println("Press 2 for Auto ");
		System.out.print("Enter your Choice : ");
		int choice = sc.nextInt();
		sc.close();
		System.out.println();
		switch (choice) {
		case 1: {
			v= new Bike();
			
		}
		break;
        case 2: {
        	v= new Auto();
    		
		}
        break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		if (v instanceof Bike) {
			Bike b = (Bike) v;
			System.out.println("Price of Bike : "+(b.price*b.distance));
		}else if (v instanceof Auto) {
			Auto a = (Auto) v;
    		System.out.println("Price of Auto : "+(a.price*a.distance));
		}
	
	}
}
