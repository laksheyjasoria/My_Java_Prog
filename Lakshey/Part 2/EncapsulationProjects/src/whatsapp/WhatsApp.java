package whatsapp;

public class WhatsApp {

	private long phno;
	private String bio;
	private String status;
	
	
	public WhatsApp(long phno, String bio, String status) {
		super();
		this.phno = phno;
		this.bio = bio;
		this.status = status;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
