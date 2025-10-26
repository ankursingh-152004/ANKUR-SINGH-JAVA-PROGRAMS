import java.util.*;
class TableUsingForLoop{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num;
System.out.println("WELCOME TO PRINTING TABLE...\n");
System.out.print("PLease, Enter the number you want to print the Table Of: ");
num=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(num +" X "+ i +" = "+ (num*i));
}
}
}