class Pattern9
{
  public static void main(String [] args)
  {
   char i='P';
   do
   {
   int j=1;
   do
   {
    System.out.print(i); 
    j++;
   }while(j<=3);
   System.out.println();
   i--;
   }while(i>='N');

   /*
   char i='P';
   while(i>='N')
   {
   int j=1;
   while(j<=3)
   {
    System.out.print(i); 
    j++;
   }
   System.out.println();
   i--;
   }*/

   /* for loop
   for(char i='P';i>='N';i--)
   {
    for(int j=1;j<=3;j++)
    {
      System.out.print(i);
    }
    System.out.println();
   }*/   
  }
}