import java.util.Scanner;
class Song{

public static void main(String [] args){
int count_sa=0;
int count_re=0;
int count_ga=0;
int count_ma=0;
int count_pa=0;
int count_da=0;
int count_ni=0;
System.out.println("Enter the song");
Scanner sc = new Scanner(System.in);
String songs = sc.nextLine();
char [] ss = songs.toCharArray();

for(int i=0;i<ss.length-1;i++){
if(ss[i]=='s'&&ss[i+1]=='a'){
count_sa++;
}
if(ss[i]=='r'&&ss[i+1]=='e'){
count_re++;
}
if(ss[i]=='g'&&ss[i+1]=='a'){
count_ga++;
}
if(ss[i]=='m'&&ss[i+1]=='a'){
count_ma++;
}
if(ss[i]=='p'&&ss[i+1]=='a'){
count_pa++;
}
if(ss[i]=='d'&&ss[i+1]=='a'){
count_da++;
}
if(ss[i]=='n'&&ss[i+1]=='i'){
count_ni++;
}
}
System.out.println("no of sa in song : "+count_sa);
System.out.println("no of re in song : "+count_re);
System.out.println("no of ga in song : "+count_ga);
System.out.println("no of ma in song : "+count_ma);
System.out.println("no of pa in song : "+count_pa);
System.out.println("no of da in song : "+count_da);
System.out.println("no of ni in song : "+count_ni);
}

}