class Pattern4
{
  public static void main(String [] args)
  {

   int i=1;
   do
   {
    char j='z';
    do
    {
     System.out.print(j);
    j--; 
    }while(j>='w');
   System.out.println();
   i++;
   }while(i<=3);

   /* while loop
   int i=1;
   while(i<=3)
   {
    char j='z';
    while(j>='w')
    {
     System.out.print(j);
    j--; 
    }
   System.out.println();
   i++;
   }*/
   
  /* for loop
   for(int i=1;i<=3;i++)
   {
    for(char j='z';j>='w';j--)
    {
      System.out.print(j);
    }
    System.out.println();
   } */  
  }
}