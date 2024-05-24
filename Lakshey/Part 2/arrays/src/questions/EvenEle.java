package questions;

public class EvenEle {

	public static void main(String[] args) {
		
		int arr[]= {3,4,5,6,4,7};
		for (int i = 0; i < arr.length; i++) {
		  if (isEven(arr[i])) {
			System.out.println(arr[i]);
		}	
		}
	}
	public static boolean isEven(int a) {
		if (a%2==0) {
			return true;
		} else {
            return false;
		}
	}
}
