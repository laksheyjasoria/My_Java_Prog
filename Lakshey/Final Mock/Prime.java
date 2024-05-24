class Prime{

public static void main(String [] args){

int a=6;
System.out.println(isPrime(2,a)==-1?"not a prime num":"Prime num");
}
public static int isPrime(int start,int num){
if(num%start!=0){
return isPrime(start+1,num);
}
else if(start==num){
return num;
}
else{
return -1;
}
}
}