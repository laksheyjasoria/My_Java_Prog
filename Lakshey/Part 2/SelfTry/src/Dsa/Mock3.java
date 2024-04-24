package Dsa;

public class Mock3 {

	public static void main(String[] args) {
		char ch = 'A';
		if (ch>='A'&&ch<='Z') {
			ch=(char) (ch + 32);
			System.out.println(ch);
		}else if (ch>='a'&&ch<='z') {
			ch=(char) (ch - 32);
			System.out.println(ch);
		}else if (ch>='0'&&ch<='9') {
			factor(ch-48);
		}
		

	}
	public static void factor(int num) {
		for (int i = 1; i <=num; i++) {
			if (num%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
