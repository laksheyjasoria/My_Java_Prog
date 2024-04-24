class NewQues
{
  public static void main(String [] args)
  {
   int x=20;
   int y=35;
   System.out.println("the add of , add of and product of "+x+" and "+y+" is "+add(add(x,y),product(x,y)));
  }
  public static int add(int a,int b)
  {
   int sum = a+b;
   return sum;
  }
  public static int product(int a,int b)
  {
    int product = a*b;
    return product;
  }
}