package tracingProg;

public class Pattern {
	public static void main(String[] args) {
		//int [] previous;
		
		
		for(int i=1; i<=5; i++)
		{
			int previous=0;
			int sum=5;
			for(int j=1; j<=i; j++)
			{
				if (j==1) {
					System.out.print(i);
					previous+= i;
				} else {
					previous+=sum;
					System.out.print(previous);
				}
				sum--;
				
				
			}
			System.out.println();
		}
	}
}
