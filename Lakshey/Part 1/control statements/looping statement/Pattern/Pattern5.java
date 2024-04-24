class Pattern5
{
  public static void main(String [] args)
  {
    int i=1;
    do
    {
     int j=5;
     do
     {
      System.out.print(j);
      j+=5;
     }while(j<=20);
     System.out.println();
     i++;
    }while(i<=3);
   
    /* while loop
    int i=1;
    while(i<=3)
    {
     int j=5;
     while(j<=20)
     {
      System.out.print(j);
      j+=5;
     }
     System.out.println();
     i++;
    }*/

   /*
   for(int i=1;i<=3;i++)
   {
    for(int j=5;j<=20;j+=5)
    {
      System.out.print(j);
    }
    System.out.println();
   } */  
  }
}