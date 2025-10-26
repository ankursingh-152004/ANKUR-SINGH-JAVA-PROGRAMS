import java.util.*;
class PrintEvenNumber{
public static void main(String[] args){
System.out.println("Welcome to Printing only even Number...");
Scanner sc=new Scanner(System.in);
System.out.print("Please,Enter the number to print even number till that number:");
int num=sc.nextInt();
for(int i=0;i<=num;i++)
{
if(i%2==1){
continue;
}
System.out.print(i+" ");
}
}
}