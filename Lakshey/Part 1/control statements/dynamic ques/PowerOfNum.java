class PowerOfNum
{
  public static void main(String [] args)
  {
   int n=4;
   int n1=n;
   for(int i=1;i<=n;i++)
   {
    if(n%i==0)
    {
      while(n1>=1)
      {
       n1/=i;
       if(n1==1)
       {
       System.out.println("The factor is : "+i);
       }
      }
      
    }
   }

  }
}