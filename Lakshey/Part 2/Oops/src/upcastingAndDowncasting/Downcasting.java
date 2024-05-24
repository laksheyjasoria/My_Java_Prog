package upcastingAndDowncasting;

public class Downcasting {

	public static void main(String[] args) {
		
        Vechile v1= new Bike();
        Bike b1 = (Bike) v1;
        System.out.println(b1.distance);
        System.out.println(b1.price);
	}
}
