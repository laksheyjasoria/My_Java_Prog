package mathProblem;

public class Rectangle extends Measurement {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		System.out.println("Length : "+rec.l);
		System.out.println("Width : "+rec.w);
		System.out.println("Area : "+rec.l*rec.w);
		System.out.println("Perimeter : "+2*(rec.l+rec.w));
	}
}
