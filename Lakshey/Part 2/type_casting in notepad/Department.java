class Department extends College
{
  String branch="CSE";
  
  public static void main(String[] args)
  {
    College c = new Department();
    System.out.println("Details after upcasting");
    System.out.println("College Name : "+c.name);
   // System.out.println("Branch Name : "+c.branch);

    System.out.println();
    System.out.println("Details after downcasting");
    Department dept =(Department) c;
    System.out.println("College Name : "+dept.name);
    System.out.println("Branch Name : "+dept.branch);
  }

}