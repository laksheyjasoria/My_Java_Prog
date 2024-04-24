class Pattern7
{
  public static void main(String [] args)
  {
    int i=1;
    do
    {
     int j=1;
     do
     {
       System.out.print("#");     
       j++;
     }while(j<=2);
     System.out.println();
     i++;
    }while(i<=4);

    /*
    int i=1;
    while(i<=4)
    {
     int j=1;
     while(j<=2)
     {
       System.out.print("#");     
       j++;
     }
     System.out.println();
     i++;
    }*/


   /*
   for(int i=1;i<=4;i++)
   {
    for(int j=1;j<=2;j++)
    {
      System.out.print("#");
    }
    System.out.println();
   }  */ 
  }
}