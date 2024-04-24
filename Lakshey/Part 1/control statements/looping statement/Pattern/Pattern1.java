class Pattern1
{
  public static void main(String [] args)
  {

    int i=1;
    do
    {
     char j='A';
     do
     {
       System.out.print(j);
       j++;
     }while(j<='C');
     System.out.println();
     i++;
    }while(i<=3);

   /* while loop
   int i=1;
   while(i<=3)
   {
    char j='A';
    while(j<='C')
    {
      System.out.print(j);
      j++;
    }
    System.out.println();
    i++;
   }   */

/* for loop
   for(int i=1;i<=3;i++)
   {
    for(char j='A';j<='C';j++)
    {
      System.out.print(j);
    }
    System.out.println();
   } */  
  }
}