package Dsa;

import java.util.Scanner;

public class Queue {
	static final int max_size=10;
	static int queue[] = new int[max_size];
	static int first=0;
	static int last = -1;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println();
			System.out.println("*** Welcome ***");
			System.out.println("Queue Implementation using java");
			System.out.println("Press 1 for enqueue");
			System.out.println("Press 2 for dequeue");
			System.out.println("Press 3 for traverse");
			System.out.println("Press 4 for exit");
			System.out.print("Enter your option : ");
			num = sc.nextInt();
			System.out.println();
		switch (num) {
		case 1:
			System.out.print("Enter the value : ");
			int a = sc.nextInt();
			System.out.println();
			enqueue(a);
			break;
		case 2:
			int b = dequeue();
			System.out.print(b==-1? "" : "The Dequeued element is : ");
			System.out.println(b==-1? "Queue Underflow" : b);
			System.out.println();
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
	  public static void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            System.out.println();
            return;
        }
        queue[++last] = value;
    }
    public static boolean isEmpty() {
      return last == -1;
  }

  public static boolean isFull() {
      return last == max_size - 1;
  }
  public static int dequeue() {
    if (isEmpty()) {
        System.out.println("Queue is empty. Cannot dequeue.");
        System.out.println();
        return -1;
    }
    int value = queue[first++];
    if (first > last) {
        first = 0;
        last = -1;
    }
    return value;
}
	public static void traverse() {
		if(first<0||last<0) {
			System.out.println("Queue Underflow");
			System.out.println();
		}else {
			System.out.println("Elements in Queue are ");
	 for (int i = first; i <= last; i++) {
		System.out.println(queue[i]);
	}	}
	}
	 public static int size() {
       return last - first + 1;
   }
}