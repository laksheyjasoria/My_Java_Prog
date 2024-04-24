class Squarelast
{
  public static void main(String [] args)
  { 
   int side = 6; 
   System.out.println("The Perimeter of square whoose side ("+side+") is "+perimeter(side));
   System.out.println("The Area of square whoose side ("+side+") is "+area(side));
  }
  public static int area(int a)
  { 
   int area=a*a;
   return area;
  }
  public static int perimeter(int a)
  { 
   int perimeter = 4*a;
   return perimeter;
  }
}