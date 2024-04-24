class Rectangle
{
  public static void main(String [] args)
  { 
   int length = 4;
   float breadth = 5.6f; 
   System.out.println("The Perimeter of rectangle whoose length("+length+") and breadth("+breadth+") is "+perimeter(length,breadth));
   System.out.println("The area of rectangle whoose length("+length+") and breadth("+breadth+") is "+area(length,breadth));
  }
  public static float area(int a,float b)
  { 
   float area=a*b;
   return area;
  }
  public static float perimeter(int a,float b)
  { 
   float perimeter = 2*(a + b);
   return perimeter;
  }
}