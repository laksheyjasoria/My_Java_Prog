package random;

import java.util.Scanner;

public class StringProb {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s;
        System.out.println("The count of each character in "+s+" is");
        for(int i=0;i<s.length();i++){
            int occur=0;
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++){
                if(ch==s1.charAt(j))
                    occur++;
            }
            
            	
            	System.out.println(ch+" : "+occur);
            }
        
        sc.close();
    }
}