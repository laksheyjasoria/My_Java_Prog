package emp;

public class Driver {

	public static void main(String[] args) {
		Employee e1 = new Employee("Lucky", 10000, 78);
		System.out.println(e1.getCname());
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getSalary());
		System.out.println(e1.getJoining_date());
		e1.setSalary(e1.getSalary()+1000);
		System.out.println(e1.getSalary());
	}
}
