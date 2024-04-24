class Days
{
  public static void main(String [] args)
  {
    int mon=15;
    
      if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
      {
        System.out.println("31 Days");
      }
      else if(mon==4||mon==6||mon==9||mon==11)
      {
        System.out.println("30 Days");
      }
      else if(mon==2)
      {
        System.out.println("28 or 29 Days");
      }
      else
      {
        System.out.println("Invalid month");
      }
   
  }
}