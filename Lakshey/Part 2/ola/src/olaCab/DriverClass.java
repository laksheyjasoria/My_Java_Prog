package olaCab;

import java.util.Scanner;

public class DriverClass {

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
		sc.close();
		System.out.println();
		switch (choice) {
		case 1: {
			c= new Mini();
			
		}
		break;
        case 2: {
        	c= new Macro();
    		
		}
        break;
        case 3: {
        	c= new Prime();
    		
        }
        break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		if (c instanceof Mini) {
			Mini m = (Mini) c;
			System.out.println("Price of Mini : "+((m.price*distance)+m.fixed));
		}else if (c instanceof Macro) {
			Macro mm = (Macro) c;
    		System.out.println("Price of Macro : "+((mm.price*distance)+mm.fixed));
		}else if (c instanceof Prime) {
			Prime p = (Prime) c;
    		System.out.println("Price of Prime : "+((p.price*distance)+p.fixed));
		}
		
	}
}
