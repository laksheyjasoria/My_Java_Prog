class Pattern3
{
  public static void main(String [] args)
  {
    int i=1;
    do
    {
     int j=4;
     do
     {
      System.out.print(j);
      j++;
     }while(j<=7);
     System.out.println();
     i++;
    }while(i<=3);

    /* while loop
    int i=1;
    while(i<=3)
    {
     int j=4;
     while(j<=7)
     {
      System.out.print(j);
      j++;
     }
     System.out.println();
     i++;
    }*/


   /* for loop
   for(int i=1;i<=3;i++)
   {
    for(int j=4;j<=7;j++)
    {
      System.out.print(j);
    }
    System.out.println();
   }*/   
  }
}