package student;
import java.util.Date;

public class Student {

	private String name;
	private long phno;
	private int roll;
	private double marks;
	private String college_name="IGU";
    private String aadhaar=generate();
	private static int count=0;
    public static String generate() {
    	Date date = new Date();
    	Long luid = (Long) date.getTime();
    	String suid = luid.toString();	
    	return suid;
    }
//	public String  getAadhaar() {
//		String last = aadhaar.substring(0, 4)+"-"+aadhaar.substring(4, 8)+"-"+aadhaar.substring(8, 12);
//		return last;
//	}
	public Student(String name, long phno,  double marks) {
		this.name = name;
		this.phno = phno;
		count++;
		this.roll = count;
		this.marks = marks;
	}
	public Student(String name, long phno,  double marks, String college_name) {
		this.name = name;
		this.phno = phno;
		count++;
		this.roll = count;
		this.marks = marks;
		this.college_name = college_name;
		//this.adhaarno = this,UniqueIDGenerator;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public String getCollege_name() {
		return college_name;
	}

}