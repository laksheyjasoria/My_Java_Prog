class SwapArray{

public static void main(String[] args){
int [] a= {10,20,30,40};
int [] b ={1,2,3,4};
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
System.out.println(b[i]);
}
for(int i=0;i<a.length;i++){
b[i]+=a[i];
}
for(int i=0;i<a.length;i++){
a[i]=b[i]-a[i];
}
for(int i=0;i<a.length;i++){
b[i]-=a[i];
}
System.out.println("After swaping");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
System.out.println(b[i]);
}
}
}