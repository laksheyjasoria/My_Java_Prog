package encapsulation;

public class Encapsulation {

	private String user_name;
	private int user_id;
	private String  password;
	
//	public void setId(int id) {
//		this.user_id = id;
//	}
	public Encapsulation(int id) {
		this.user_id=id;
	}
	public Encapsulation(String name) {
		this.user_name=name;
	}
	public Encapsulation(int id,String name) {
		this(id);
		this.user_name=name;
	}
	public void setName(String name) {
		this.user_name = name;
	}
	public void setPassword(String password) {
		this.password =password;
	}
	public int getId() {
		return this.user_id;
	}
	public String getName() {
		return this.user_name;
	}
//	public String getPassword() {
//		return this.password;
//	}
//	public static void main(String[] args) {
//		Encapsulation e = new Encapsulation(5);
//		System.out.println(e.getId());
//		e.setPassword("Lucky@123");
//	}
}
