package college;

public class College {

	String cname ="IGU";
	String branch ;
	String name;
	public College(String branch, String name) {
		//super();
		this(name);
		this.branch = branch;
	//	this.name = name;
	}
	public College(String name) {
		//super();
		this.name = name;
	}
	
}
