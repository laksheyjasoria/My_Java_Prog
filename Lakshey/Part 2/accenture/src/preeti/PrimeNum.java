package preeti;
import java.util.Scanner;
public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int nextPrime = findNextPrime(num);
        System.out.println("The smallest prime number greater than " + num + " is " + nextPrime);
        sc.close();
    }

    public static int findNextPrime(int num) {
        num++;
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
   
}
