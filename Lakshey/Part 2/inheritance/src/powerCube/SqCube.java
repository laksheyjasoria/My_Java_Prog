package powerCube;

public class SqCube extends Number {

	public static void main(String[] args) {
		SqCube sc = new SqCube();
		System.out.println("Num : "+sc.num);
		System.out.println("Cube : "+sc.cube());
		System.out.println("Square : "+sc.sq());
	}
	int cube() {
		return this.num*this.num*this.num;
	}
	int sq() {
		return this.num*this.num;
	}
}
