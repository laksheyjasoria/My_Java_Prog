package random;
import java.util.Date;
//import java.util.Random;
public class RandomIdGen {

	public static void main(String[] args) {
		Date date = new Date();
		Long luid = (Long) date.getTime();
		String suid = luid.toString();
		System.out.println(suid+": "+suid.length() + " characters");

//		Random rn = new Random();
//		Integer long1 = rn.nextInt(9999);
//		Integer long2 = rn.nextInt(9999);
//		Integer long3 = rn.nextInt(9999);
//	   // Integer long2 = rn.nextInt(13);
//System.out.println(long1);
//		String newstr =  long1 +" "+long2+" "+long3;
//		System.out.println("New string in spaced format: "+newstr);
//		System.out.println("New string in proper format: "+newstr.replaceAll(" ", ""));
	}
}
