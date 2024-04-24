class ArmstrongNumber
{
  public static void main(String[] args)
  {
   int a =153;
   System.out.println(isArmstrong(a));
  }
  public static String isArmstrong(int num)
  {
    int sum=0;
    int temp=num;
    while(num>0)
    {
      sum+=cube(num%10);
      num/=10;
    }
    if(temp==sum)
    {
     return "the number "+temp+" is a Armstrong number"; 
    }else
     {
       return "the number "+temp+" is not a Armstrong number";    
     }
  }
  public static int cube(int num)
  {
    return num*num*num;
  }
}