import java.util.Scanner;
class RandomStr{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
boolean str1=false;
boolean str2=false;
boolean str3=false;
boolean str4=false;
s+=" ";
String s1=" ";
String s2=" ";
String s3=" ";
String s4=" ";
		int previous=0;
                int occurence=0;
		for(int i=0;i<s.length();i++)
		{

			if(s.charAt(i)==' '){
				for(int j=previous;j<i;j++){
if(occurence ==0){
s1+=s.charAt(j);
}
if(occurence ==1){
s2+=s.charAt(j);
}
if(occurence ==2){
s3+=s.charAt(j);
}
if(occurence ==3){
s4+=s.charAt(j);
}
					
                                    }
	occurence++;		
previous=i+1;
}
}
while(str1==false||str2==false||str3==false||str4==false){
int num = randomNum();
if(num==1&&str1==false){
System.out.print(s1);
str1=true;
}
else if(num==2&&str2==false){
System.out.print(s2);
str2=true;
}
else  if(num==3&&str3==false){
System.out.print(s3);
str3=true;
}
else if(num==4&&str4==false){
System.out.print(s4);
str4=true;
}
else{
num = randomNum();
}
}
}
public static int randomNum(){
double d = Math.random()*10;
return (int) d;
}
}



