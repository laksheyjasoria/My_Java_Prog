package olaCab;

import java.awt.Choice;
import java.util.Scanner;

public class Cab {

	double fixed =15;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter how much distance you want to travel : ");
		double distance = sc.nextDouble();
		System.out.println();
		Cab c;
		System.out.println("From which type of vechile you want to travel ");
		System.out.println("Press 1 for Mini ");
		System.out.println("Press 2 for Macro ");
		System.out.println("Press 3 for Prime ");
		System.out.print("Enter your Choice : ");
		int choice = sc.nextInt();
		System.out.println();
		switch (choice) {
		case 1: {
			c= new Mini();
			Mini m = (Mini) c;
			
		}
		break;
        case 2: {
        	c= new Macro();
    		Macro mm = (Macro) c;
			
		}
        break;
        case 3: {
        	c= new Prime();
    		Prime p = (Prime) c;
	
        }
        break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
		System.out.println("Price of Mini : "+m.price);
		
		System.out.println("Price of Macro : "+mm.price);
	
		System.out.println("Price of Prime : "+p.price);
	}
}
