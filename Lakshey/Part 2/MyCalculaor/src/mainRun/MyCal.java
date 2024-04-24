package mainRun;

import java.util.Scanner;
import addition.Additon;
import division.Division;
import subtraction.Subtraction;
import multiplication.Multiplication;
import number.*;
import operations.*;
import pattern.*;
public class MyCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println();
			System.out.println("*** Welcome to My Calculator ***");
			System.out.println();
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Number Check");
			System.out.println("Press 6 for Operation");
			System.out.println("Press 7 for Pattern");
			System.out.println("Press 8 for Exit");
			System.out.print("Enter your Option : ");
			num = sc.nextInt();
			System.out.println();
		switch (num) {
		case 1:
			//addition
			System.out.println("Values for Addition");
			System.out.print("Enter first num : ");
			int a = sc.nextInt();
			System.out.print("Enter second num : ");
			int b = sc.nextInt();
			System.out.println("Additon of "+a+" and "+b+" is : "+Additon.add(a,b));
			break;
		case 2:
			//subtraction
			System.out.println("Values for Subtraction");
			System.out.print("Enter first num : ");
			int num1 = sc.nextInt();
			System.out.print("Enter second num : ");
			int num2 = sc.nextInt();
			Subtraction s1 = new Subtraction();
			System.out.println("Subtraction of "+num1+" and "+num2+" is : "+s1.sub(num1,num2));
			break;
			
		case 3:
			System.out.println("Values for Multiplication");
			System.out.print(" Enter first num : ");
			int num3 = sc.nextInt();
			System.out.print(" Enter second num : ");
			int num4 = sc.nextInt();
			System.out.println("Division of "+num3+" by "+num4+" is : "+Multiplication.multiply(num3,num4));
			break;

        case 4:
        	System.out.println("Values for Division");
			System.out.print(" Enter Divident : ");
			int c = sc.nextInt();
			System.out.print(" Enter Divisor : ");
			int d = sc.nextInt();
			System.out.println("Division of "+c+" by "+d+" is : "+Division.division(c,d));
			break;
		
        case 5:
        	int operation = 0;
        	do {
        	System.out.println("*** Number Check ***");
			System.out.println();
			System.out.println("Press 0 for Previous Menu");
        	System.out.println("Press 1 for Checking Armstrong Number");
			System.out.println("Press 2 for Checking Even Odd");
			System.out.println("Press 3 for Checking Palindrome Number");
			System.out.println("Press 4 for Checking Perfect Number");
			System.out.println("Press 5 for Checking Prime Number");
			System.out.println("Press 6 for Checking Spy Number");
			System.out.println("Press 7 for Checking Strong Number");
			System.out.println("Press 8 for Checking Two Special Number");
			System.out.println("Press 9 for Checking Xylem Phloem Number");
			System.out.println("Press 10 for exit");
			System.out.print("Enter your Option : ");
			operation = sc.nextInt();
			switch (operation) {
			case 1:
				System.out.print(" Enter number for find Armstrong or not : ");
				int arm = sc.nextInt();
				System.out.println("Cube of "+arm+" is : "+ArmstrongNum.armstrong(arm));
				break;
				
			case 2:
				System.out.print(" Enter number to check it is Even or Odd : ");
				int even = sc.nextInt();
				System.out.println(EvenOdd.isEven(even)?"Even":"Odd");	
				break;
		
			case 3:
				System.out.print(" Enter number to check it is palindrome : ");
				int palindrome = sc.nextInt();
				System.out.println( PalindromeNum.isPalin(palindrome));
				break;
				
			case 4:
				System.out.print(" Enter number to check it is perfect number : ");
				int perfect = sc.nextInt();
				System.out.println(PerfectNum.sumFactor(perfect)?"Perfect Number":"Not a Perfect Number");
				break;
				
			case 5:
				System.out.print(" Enter number to check it is Prime or not : ");
				int prime = sc.nextInt();
				System.out.println(Prime.isPrime(prime));
				break;
				
			case 6:
				System.out.print(" Enter number to check it is Spy Number or not : ");
				int spy = sc.nextInt();
				System.out.println(SpyNum.spy(spy)?"Spy Number":"Not a Spy Number");
				break;
			case 7:
				System.out.print(" Enter number to check it is Strong Number or not : ");
				int strong = sc.nextInt();
				System.out.println( StrongNum.isStrong(strong) ?"Strong Number":"Not a Strong Number");
				break;
			case 8:
				System.out.print(" Enter number to check it is Special Two Digit Number or not : ");
				int s2 = sc.nextInt();
				System.out.println(SpecialTwoDigitNum.twoDigit(s2));
				break;
			case 9:
				System.out.print(" Enter number to check it is Xylem or Phloem : ");
				int xp = sc.nextInt();
				System.out.println(XylemPhloyem.xylemPhloem(xp));
				break;
			case 10:
				System.out.println("Thank you for using our services");
		        System.out.println("For more suggestion contact lucky");
				num=8;
				operation=8;
				break;
			case 0:
				System.out.println("You will be redirected to the previous menu ");
				operation=8;
				break;
			default:
				System.out.println("You entered wrong key");
				break;
			}
			}while(operation!=8);
        	break;
        	
        case 6:
        	int number = 0;
        	do {
        	System.out.println("*** Operations ***");
			System.out.println();
        	System.out.println("Press 1 for Cube");
			System.out.println("Press 2 for Count of Digit");
			System.out.println("Press 3 for Factorial");
			System.out.println("Press 4 for Factors");
			System.out.println("Press 5 for Power");
			System.out.println("Press 6 for Square");
			System.out.println("Press 7 for Previous menu");
			System.out.println("Press 8 for exit");
			System.out.print("Enter your Option : ");
			number = sc.nextInt();
			switch (number) {
			case 1:
				System.out.print(" Enter number for find cube : ");
				int cube = sc.nextInt();
				Cube c1 = new Cube();
				System.out.println("Cube of "+cube+" is : "+c1.cube(cube));
				break;
				
			case 2:
				System.out.print(" Enter number for find no of digit : ");
				int count = sc.nextInt();
				DigitCount dc = new DigitCount();
				System.out.println("Cube of "+count+" is : "+dc.countDig(count));
				break;
		
			case 3:
				System.out.print(" Enter number for find its factorial : ");
				int factorial = sc.nextInt();
				System.out.println("Factorial of "+factorial+" is : "+Factorial.fact(factorial));
				break;
				
			case 4:
				System.out.print(" Enter number whoose you want to get factors : ");
				int factors = sc.nextInt();
				Factors.factor(factors);
				break;
				
			case 5:
				System.out.print(" Enter base : ");
				int base = sc.nextInt();
				System.out.print(" Enter power : ");
				int pow = sc.nextInt();
				System.out.println("Power "+pow+" of "+base+" is : "+Power.power(base, pow));
				break;
				
			case 6:
				System.out.print(" Enter number for find square : ");
				int sq = sc.nextInt();
				System.out.println("Square of "+sq+" is : "+Square.sq(sq));
				break;
				
			case 7:
				System.out.println("You will be redirected to the previous menu ");
				number=8;
				break;
				
			case 8:
				System.out.println("Thank you for using our services");
		        System.out.println("For more suggestion contact Lucky");
				num=8;
				number=8;
				break;
				
			default:
				System.out.println("You entered wrong key");
				break;
			}
			}while(number!=8);
			break;
			
        case 7:
        	int pattern = 0;
        	do {
        	System.out.println("*** Star Pattern ***");
			System.out.println();
			System.out.println("Press 0 for Previous Menu");
        	System.out.println("Press 1 for Left Sided right angle triangle");
			System.out.println("Press 2 for Right Sided right angle triangle");
			System.out.println("Press 3 for inverted Left Sided right angle triangle");
			System.out.println("Press 4 for inverted Right Sided right angle triangle");
			System.out.println("Press 5 for Triangle");
			System.out.println("Press 6 for Inverted Triangle");
			System.out.println("Press 7 for Diamond");
			System.out.println("Press 8 for K");
			System.out.println("Press 9 for hollow square");
			System.out.println("Press 10 for exit");
			System.out.print("Enter your Option : ");
			number = sc.nextInt();
			System.out.println();
			System.out.println("Enter Number : ");
			int p1 = sc.nextInt();
			switch (number) {
			case 1:
				//System.out.print(" Enter number : ");
				//int p1 = sc.nextInt();
			    LeftSided.pattern(p1);
				break;
				
			case 2:
				//System.out.print(" Enter number : ");
				//int p2 = sc.nextInt();
				RightSided.pattern(p1);
				break;
		
			case 3:
				//System.out.print(" Enter number : ");
				//int p3 = sc.nextInt();
				LeftInverted.pattern(p1);
				break;
				
			case 4:
				//System.out.print(" Enter number : ");
				//int p4 = sc.nextInt();
				RightInverted.pattern(p1);
				break;
				
			case 5:
				//System.out.print(" Enter number : ");
				//int p5 = sc.nextInt();
				Triangle.pattern(p1);
				break;
				
			case 6:
				//System.out.print(" Enter number : ");
				//int p6 = sc.nextInt();
TriangleInverted.pattern(p1);
				break;
			case 7:
				Diamond.pattern(p1);
				break;
			case 8:
				KShaped.pattern(p1);
				break;
			case 9:
				HollowSq.pattern(p1);
				break;
			case 0:
				System.out.println("You will be redirected to the previous menu ");
				number=8;
				break;
				
			case 10:
				System.out.println("Thank you for using our services");
		        System.out.println("For more suggestion contact Lucky");
				num=8;
				number=8;
				break;
				
			default:
				System.out.println("You entered wrong key");
				break;
			}
			}while(pattern!=8);
			break;
        case 8:
           System.out.println("Thank you for using our services");
           System.out.println("For more suggestion contact lucky");
			break;
		default:
			System.out.println("!Invalid Option");
			System.out.println("Enter the valid option ");
			break;
		}
		} while (num!=8);
		sc.close();
	}
}
