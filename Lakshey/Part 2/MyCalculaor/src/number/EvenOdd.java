package number;

public class EvenOdd {

	public static void main(String[] args) {
	System.out.println(isEven(6)?"Even":"Odd");	
	}
	public static boolean isEven(int num) {
		if (num%2==0) {
			return true;
		} else {
            return false;
		}
	}
}
