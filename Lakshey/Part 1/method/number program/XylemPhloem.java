class XylemPhloem
{
  public static void main(String[] args)
  {
    int a=34561;
    System.out.println(xylemPhloem(a));
  }
  public static String xylemPhloem(int num)
  {
    //int check = num;
    int r=0,outer_sum=0,inner_sum=0;
    int count= counts(num);
    int chk=count;
    while(num>0)
    {
     r=num%10;
     if(chk==count||chk==1)
     {
       outer_sum+=r;
     }
     else
     {
       inner_sum+=r;
     }
     num/=10;
     chk--;
    }
    if(outer_sum==inner_sum)
    {
     return "Xylem";
    }
    else
    {
      return "Phloem";
    }
             
  }
  public static int counts(int num)
  {
    int count =0;
    while(num>0)
    {
     num/=10;
     count++;
    }
   return count; 
  }
}