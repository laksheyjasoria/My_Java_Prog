package questions;

public class SwapArray {
	public static void main(String[] args) {
		int arr[]= {3,4,5,6,4,7};
		int rev[] = new int[arr.length];
		int j=0;
		for (int i = arr.length-1; i >=0; i--) {
			rev[j]= arr[i];
			j++;
		}
		System.out.println("after swaping");
		for (int i : rev) {
			System.out.println(i);
		}
	}

}
