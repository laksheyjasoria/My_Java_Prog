package preeti;

import java.util.Scanner;

public class SubString {


    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str1 = "daman";
        String str2 = "aman";
//    	System.out.print("Enter first String : ");
//    	String str1 = sc.nextLine();
//    	System.out.println();
//    	System.out.print("Enter Secong String : ");
//    	String str2 = sc.nextLine();
//    	System.out.println();
        System.out.println("Number of common substrings: " + countCommonSubstrings(str1, str2));
  sc.close();
    }

    public static int countCommonSubstrings(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String substring = str1.substring(i, j);
                if (str2.contains(substring)) {
                    count++;
                }
            }
        }
        return count;
    }
}

