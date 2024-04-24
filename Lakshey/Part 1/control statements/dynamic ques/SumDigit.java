class SumDigit
{
  public static void main(String [] args)
  {
   int n=4009,count=0,c=0;
   int b;
   int a=n,d=n;
   while(a!=0)
   {
    a/=10;
    count++;
   }
   for(int i=1;i<=count;i++)
   {
    b=d%10;
    c+=b;
    d/=10;
   }
   System.out.println("The Sum of all digit of the number "+n+" is "+c);
  }
}