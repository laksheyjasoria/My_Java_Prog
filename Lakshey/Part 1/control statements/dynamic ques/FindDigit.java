class FindDigit
{
  public static void main(String [] args)
  {
   int n=4009,count=0;
   int b;
   int a=n;
   while(a!=0)
   {
    a/=10;
    count++;
   }
   for(int i=1;i<=count;i++)
   {
    b=n%10;
    System.out.println(b);
    n/=10;
   }
   
  }
}