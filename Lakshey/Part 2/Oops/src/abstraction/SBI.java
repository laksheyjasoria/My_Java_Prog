package abstraction;

public class SBI extends Atm {

	@Override
	public void deposit() {
	System.out.println("500 is deposited");	
	}

	@Override
	public void withdrawl() {
		System.out.println("100 is widthrawl");

	}
    public void m1() {
		System.out.println("hello");
	}
public static void main(String[] args) {
	//Atm atm = new Atm();
	SBI a1 = new SBI();
	a1.deposit();
	a1.m1();
	a1.withdrawl();
	
	Atm a2 = new SBI();
	a2.deposit();
	//a2.m1();
	a2.withdrawl();
	
}
}
