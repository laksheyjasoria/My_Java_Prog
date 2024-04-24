package Dsa;

public class Mock {

	public static void main(String[] args) {
		task(8);
	}
	public static boolean isEven(int num) {
		boolean output=false;
		while(num>=2) {
			num-=2;
			if(num==0) {
				output=true;
			}
			else if(num==1) {
				output= false;
			}
		}
		return output;
	}
	public static int factorial(int num) {
		if (num>0) {
			return num*factorial(num-1);
		} else {
          return 1;
		}
	}
	public static void task(int num) {
		if(num<0) {
			System.out.println(num*-1);
		}else if (num>0) {
		System.out.println(isEven(num)?"Even":"Odd");
			
		}else {
			System.out.println("Factorial : "+factorial(5));
		}
	}
}
