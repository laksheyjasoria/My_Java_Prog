import java.util.Scanner;
class StrConvert{

public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the character");
String s = sc.nextLine();
char c = s.charAt(0);
System.out.print("Accessing the character : "+c);
}
}