class EvenOdd
{

  public static void main(String[] args)
  {
    evenOdd(24);
  }
  public static void evenOdd(int num)
  {
    if(num>0){
    int check =num;
    while(check>=2)
    {
      check-=2;
      if(check==0)
      {
        System.out.println("The number "+num+" is Even");
      }
      else if(check==1)
      {
        System.out.println("The num "+num+" is Odd");
      }
  
    }
   }else
   {
     System.out.println("The number is not greater than zero");
   }
  }

}