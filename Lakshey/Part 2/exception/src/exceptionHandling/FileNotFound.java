package exceptionHandling;

import java.io.FileOutputStream;

public class FileNotFound {

	public static void main(String[] args) {
		FileOutputStream file = new FileOutputStream("dkjf.txt");
	}
}