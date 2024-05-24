class ExHand{

public static void main(String [] args){

try{
div();
}
catch(ArithmeticException e){
System.out.println("Division by zero");
}
finally{
System.out.println("Thank You");
}
}
public static void div() throws ArithmeticException
{
int a = 2/0;
}

}