package random;

public class MaxSubArray {

	public static void main(String[] args) {
		int a[] = {5,4,-1,7,8};
		int max=0;
		for (int i = 0; i < a.length; i++) {
			//int sum=0;
			for (int j = i; j < a.length; j++) {
				 int s=0;
	                for(int k=i;k<=j;k++)
	                {
	                    s+=a[k];
	                }
	               // System.out.println(s);
	                
	                if(s>max)
	                {
	                   max=s;
	                }
	                

			}
		}
		System.out.println("the maxm sum of sub array is :"+max);
	}
}
