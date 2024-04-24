package operations;

public class Cube {
  public static void main(String[] args) {
	  Cube c = new Cube();
	  System.out.println(c.cube(4));
}
  public int cube(int num) {
	return num*num*num;
}
}
