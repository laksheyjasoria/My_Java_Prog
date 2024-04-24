class PerfecNumber
{
  public static void main(String[] args)
  {
   int a =6;
   if(a==sumFactor(a))
   {
    System.out.println("The number "+a+" is perfect Number");
   }else
   {
    System.out.println("The number "+a+" is not perfect Number"); 
   }
  }
  public static int sumFactor(int num)
  {
    int sum=0;
    for(int i=1;i<num;i++)
    {
      if(num%i==0)
      {
        sum+=i;
      }
    }
    return sum;
  }
}