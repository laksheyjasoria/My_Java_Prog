package questions;

public class EvenIndex {

	public static void main(String[] args) {
		int arr[]= {3,4,5,6,4,7,6,3,1,0,7};
		for (int i = 0; i <arr.length; i++) {
			if (i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
