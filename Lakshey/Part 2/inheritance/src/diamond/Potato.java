package diamond;

public class Potato extends Fruits implements Vegetable{

	public static void main(String[] args) {
		Potato p1 = new Potato();
		System.out.println(p1.type);
		System.out.println(p1.origin);
		//System.out.println(p1.equals(p1));
		System.out.println(p1.getClass());
		System.out.println(p1.hashCode());
	}
}