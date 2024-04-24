class Reverse
{
  public static void main(String[] args)
  {
    reverse(142);
  }
  public static void reverse(int num)
  {
    int count = counts(num);
    int sum = 0;
    int c = count;
    while (num>0)
    {
      sum+=(num%10)*(pow(10,c-1));
      c--;
      num/=10;
    }
    System.out.println(sum);
  }
  public static int counts(int num)
  {
    int count =0;
    while (num>0)
    {
      num/=10;
      count++;
    }
    return count;
  }
  public static int pow(int base, int power)
  {
    int result =1;
    for (int i = 1; i <= power; i++)
    {
      result *= base;
    }
   return result;
  }
}