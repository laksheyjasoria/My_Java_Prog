package whatsapp;

public class Driver {

	public static void main(String[] args) {
		WhatsApp u1 = new WhatsApp(7206169908l, "Lucky", "Feeling Happy");
		System.out.println(u1.getPhno());
		System.out.println(u1.getBio());
		System.out.println(u1.getStatus());
		u1.setBio("Lakshey Kumar");
		System.out.println(u1.getBio());
	}
}
