class TwoDigitSpecial
{
  public static void main(String[] args)
  {
   int a=5;
   System.out.println(twoDigit(a));
  }
  public static String twoDigit(int num)
  {
    int check = num;
    int sum =0;
    int pro =1;
   if(counts(num)==2){
    while(num>0)
    {
     sum+=num%10;
     pro*=num%10;
     num/=10;
    }
     if(check==(sum+pro))
     {
      return "The number "+check+" is special two digit number";
     }
     else
     {
      return "The number "+check+" is not a special two digit number";
     }
  }
  else
  {
    return "The number "+check+" is not a two digit number";
  }
  }
 public static int counts(int num)
 {
  int count=0;
  while(num>0)
  {
   num/=10;
   count++; 
  }
 return count;
 }
}