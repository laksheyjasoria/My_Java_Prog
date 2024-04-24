class Power
{
  public static void main(String[] args)
  {
    int a = 2;
    int b = 3;
    int c = power(a,b);
    System.out.println("The power of base "+a+" is "+c);
  }
  public static int power(int base,int power)
  {
    int res=1;
    for(int i=1;i<=power;i++)
    {
        res*=base;     
    }
    return res;
  }
}