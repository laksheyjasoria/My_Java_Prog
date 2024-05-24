package upcastingAndDowncasting;

public class Upcasting {

	public static void main(String[] args) {
		
		Vechile v1 = new Bike();
		System.out.println(v1.distance);
		//System.out.println(v1.price);
		Vechile v2;
		Bike b1 = new Bike();
		v2=b1;
		System.out.println(v2.distance);
		//System.out.println(v2.price);
	}
}
