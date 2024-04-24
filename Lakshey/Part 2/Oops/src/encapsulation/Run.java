package encapsulation;
import encapsulation.Encapsulation;
public class Run {

	public static void main(String[] args) {
		Encapsulation e =new Encapsulation(5,"Nikku");
		System.out.println(e.getId());
		System.out.println(e.getName());
		e.setName("Lucky");
//		e.setId(7);
		e.setPassword("Lucky@123");
		System.out.println("Id : "+e.getId());
		System.out.println("Name : "+e.getName());
		//System.out.println("Password : "+e.getPassword());
	}
}
