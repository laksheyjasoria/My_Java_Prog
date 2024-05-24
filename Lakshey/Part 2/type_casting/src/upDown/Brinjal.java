package upDown;


public class Brinjal extends Vegetable {

	double price=50;
	public static void main(String[] args) {
		Vegetable veg = new Brinjal(); // upcasting
		System.out.println("Origin : "+veg.origin);
	//	System.out.println("Vegies price: "+veg.price);
		
		//Downcasting
		Brinjal b = (Brinjal) veg;
		System.out.println("Origin : "+b.origin);
		System.out.println("Rs. "+b.price);
	}
}
