class StrongNumber
{
  public static void main(String[] args)
  {
   int a =147;
   System.out.println(isStrong(a));
  }
  public static String isStrong(int num)
  {
   int check = num;
   //int r=0;
   int sum=0;
    while(num>0)
    {
    // r=num%10;
     sum+=factorial(num%10);
     num/=10;
    }
    if(check==sum)
    {
     return "the number "+check+" is a Strong number"; 
    }else
     {
       return "the number "+check+" is not a Strong number";    
     }
  }

  public static int factorial(int num)
  {
   int fact =1;
   for(int i=1;i<=num;i++)
   {
     fact*=i;
   }
   return fact;
  }
}