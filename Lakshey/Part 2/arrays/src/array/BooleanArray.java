package array;

public class BooleanArray    {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		boolean [] arr= new boolean[5];//declaration of an array
		arr[0]=true;
		arr[1]=false;
		arr[2]=true;
		arr[3]=true;
		arr[4]=false;
		//int b[]= {3,4,5,6,4,7};
		
		System.out.println("Reference of the array : "+arr);//for reference
		
	    System.out.println("The no. of elements present in the array is : "+arr.length);
	    
	    System.out.println("Print using index");
	    System.out.println(arr[0]);
	    System.out.println(arr[1]);
	    System.out.println(arr[2]);
	    System.out.println(arr[3]);
	    System.out.println(arr[4]);
	    System.out.println();
			
			System.out.println("---Forward Traversing---");
			// by the help of for loop
			for (int i = 0; i < arr.length; i++) {
				   System.out.println("Element at index "+ i+" : "+arr[i]);
			}
			
			//by the help of while loop
//			int j= 0;
//			while (j<arr.length) {
//				System.out.println("Element at index "+ j+": "+arr[j]);
//				j++;
//			}
			
			//by the help of do while loop
//			int k=0;
//			do {
//				System.out.println("Element at index "+ k+": "+arr[i]);
//				k++;
//			} while (k<arr.length);
			
			System.out.println("---Backward Traversing---");
			
			// by the help of for loop
			for (int i =  arr.length-1; i >=0; i--) {
				   System.out.println("Element at index "+ i+" : "+arr[i]);
			}
			
			//by the help of while loop
//			int j=  arr.length-1;
//			while (j>=0) {
//				System.out.println("Element at index "+ j+": "+arr[j]);
//				j--;
//			}
			
			//by the help of do while loop
//			int k=arr.length-1;
//			do {
//				System.out.println("Element at index "+ k+": "+arr[k]);
//				k--;
//			} while (k>=0);
			
	//Foreach loop
		for (boolean b : arr) {
			System.out.println(b);
		}
	}
	

}

