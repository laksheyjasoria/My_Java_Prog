package Dsa;
import java.util.Scanner;
public class Stack {

	static final int max_size=10;
	static int stack[];
	static int top=-1;
	public static void main(String[] args) {
		stack = new int[max_size];
	   Scanner sc = new Scanner(System.in);
//		System.out.println("*** Welcome ***");
//		System.out.println("Stack Implementation using java");
//		System.out.println("Press 1 for push");
//		System.out.println("Press 2 for pop");
//		System.out.println("Press 3 for traverse");
//		System.out.println("Press 4 for exit");
		int num = 0;
		do {
			System.out.println("*** Welcome ***");
			System.out.println("Stack Implementation using java");
			System.out.println("Press 1 for push");
			System.out.println("Press 2 for pop");
			System.out.println("Press 3 for traverse");
			System.out.println("Press 4 for exit");
			num = sc.nextInt();
		switch (num) {
		case 1:
			int a = sc.nextInt();
			push(a);
			break;
		case 2:
			int b = pop();
			System.out.println(b==-1? "Stack Underflow" : b);
			break;
			
		case 3:
			traverse();
			break;


		default:
			System.out.println("You entered wrong key");
			break;
		}
		} while (num!=4);
		sc.close();
	}
	public static void push(int num) {
		if(top==max_size) {
			System.out.println("Stack Overflow");
		}
		else {
			top++;
			stack[top] = num;
		}
	}
	public static int pop() {
		int num =-1;
		if(top<0) {
			System.out.println("Stack Underflow");
		}
		else {
			num = stack[top];
			top--;
		}	
		return num;
	}
    public static void traverse() {
    	if(top<0) {
			System.out.println("Stack Underflow");
		}else {
	 for (int i = 0; i <= top; i++) {
		System.out.println(stack[i]);
	}	}
    	
	}

}
