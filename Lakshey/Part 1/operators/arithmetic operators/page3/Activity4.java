class Activity4
{
  public static void main(String [] args)
  {
    int a= 567;
    int digit10th=a%10;
    int digit100th=(a%100)/10; 
    int digit1000th=(a%1000)/100; 
    int sum = digit100th;
    System.out.println(sum);
  }
}