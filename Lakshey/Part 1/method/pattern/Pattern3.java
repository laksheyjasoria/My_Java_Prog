class Pattern3
{
  public static void main(String[] args)
  {
    pattern(5);
  }
  public static void pattern(int num)
  {
   for(int i=0;i<=num;i++)
   {
     for(int j=0;j<num-i;j++)
     {
        System.out.print(" ");
      }
     for(int j=0;j<i;j++)
     {
        System.out.print("*");
      }
    System.out.println();
   }
  }
}