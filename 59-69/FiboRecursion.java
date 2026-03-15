import java.util.*;
class FiboRecursion{
public static void main(String[] args){
System.out.println("Welcome To Fibonacci Seriies Using Recursion...");
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number till which the series has to be printed :");
int num=sc.nextInt();
for(int i=1;i<=num;i++){
System.out.print(fibo(i)+ " ");
}
}
public static int fibo(int pos){
if(pos==1){
return 0;
}
if(pos==2){
return 1;
}
return fibo(pos-1)+fibo(pos-2);
}
}