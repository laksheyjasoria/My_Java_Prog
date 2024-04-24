class Pattern7
{
  public static void main(String[] args)
  {
    pattern(5);
  }
  public static void pattern(int num)
  {
   for(int i=num;i>=0;i--)
   {
     for(int j=num-i;j>=0;j--)
     {
        System.out.print(" ");
      }
     for(int j=i;j>0;j--)
     {
        System.out.print("* ");
      }
    System.out.println();
   }
  }
}