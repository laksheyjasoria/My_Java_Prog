class SpyNumber
{
  public static void main(String[] args)
  {
    int a =133;
    System.out.println(spy(a));
  }
  public static String spy(int num)
  {
   int temp=num;
   int r=0;
   int sum=0;
   int pro =1;
   while(num>0)
   {
    r=num%10;
    sum +=r;
    pro*=r;
    num/=10;
   } 
   if(sum==pro)
   {
     return "The number "+temp+" is a Spy Number";
   }else
   {
      return "The number "+temp+" is not a Spy Number";
   }
  }
}