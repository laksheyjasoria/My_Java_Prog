package upcastingAndDowncasting;

public class UpDownException {

	public static void main(String[] args) {
//		Bike b1 = (Bike) new Vechile();
//		System.out.println(b1.distance);
		Vechile v1 = new Vechile();
		Bike b2= (Bike) v1;
		System.out.println(b2.distance);
	}
}
