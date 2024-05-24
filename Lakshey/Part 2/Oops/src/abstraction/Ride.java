package abstraction;

public class Ride implements Bike{

	public void harleyDavidson() {
		System.out.println("Reached 180km/h in just 3 min");
	}
    public String splendor() {
		System.out.println("Reached 90km/hr in just 5 min");
	return "Best Average Bike";
    }
    public static void main(String[] args) {
		Ride r = new Ride();
		r.harleyDavidson();
		r.splendor();
		System.out.println(r.splendor());
		
		Bike b = new Ride();
		b.harleyDavidson();
		System.out.println(r.splendor());
	}
}
