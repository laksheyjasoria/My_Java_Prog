package array;



public class StringArray     {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		String [] arr= new String[5];//declaration of an array
		arr[0]="Pritee";
		arr[1]="Pushpa";
		arr[2]="Panku";
		arr[3]="Nikku";
		arr[4]="Lucky";
		//int b[]= {3,4,5,6,4,7};
		
//		System.out.println(arr);//for reference
		
//		System.out.println(Arrays.toString(arr));// convert into string format
//	System.out.println("The no. of elements present in given array is : "+arr.length);
		
		
		// by the help of for loop
	/*	for (byte i = 0; i < arr.length; i++) {
			   System.out.println("Element at index "+ i+": "+arr[i]);
		}*/
		
        /*   for (int i = arr.length-1; i >=0; i--)   {
			System.out.println("Element at index "+ i+": "+arr[i]);
		} */

		//BY THE HELP OF WHILE LOOP IN FORWARD DIRECTION
      /*  int i=0;
		while(i<arr.length) {
			System.out.println("Element at index "+ i+": "+arr[i]);
			i++;
		}*/
		/*int j= arr.length-1;
		while (j>=0) {
			System.out.println("Element at index "+ j+": "+arr[j]);
			j--;
		}*/
		
     //		BY THE HELP OF DO WHILE LOOP IN FORWARD DIRECTION
		/* int i=0;
		do {
			System.out.println("Element at index "+ i+": "+arr[i]);
			i++;
		} while (i<arr.length);
		
		*/
    //	BACKWARD DIRECTION BY THE HELP OF DO WHILE LOOP	
		
		/*int j =arr.length-1;
		do {
			System.out.println("Element at index "+ j+": "+arr[j]);
			j--;
		} while (j>=0);
		*/
		for (String b : arr) {
			System.out.println(b);
		}
	}
	

}

