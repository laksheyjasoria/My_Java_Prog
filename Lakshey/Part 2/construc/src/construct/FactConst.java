package construct;

public class FactConst {

	public FactConst(int a) {
		// TODO Auto-generated constructor stub
		System.out.println(fact(a));
	}
	public static void main(String[] args) {
		FactConst aConst = new FactConst(5);
		System.out.println(aConst);
	}
	public static int fact(int a) {
		if (a>0) {
			return a*fact(a-1);
		}else {
			return 1;
		}
	}
}
