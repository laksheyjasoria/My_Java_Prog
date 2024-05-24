class Driver{

public static void main(String [] args){

Car c= new Audi();
if( c instanceof Car ){
Audi a = (Audi) c;
}

}
}