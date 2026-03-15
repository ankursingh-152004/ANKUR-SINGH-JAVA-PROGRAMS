import java.util.*;
class Calculator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO SIMPLE CALULATOR...\n");
System.out.print("PLease, Enter the First Number:");
int num1=sc.nextInt();
System.out.print("PLease, Enter the Second Number:");
int num2=sc.nextInt();
System.out.print("PLease, Enter the Operation You  Want To Perform:");
String op=sc.next();
int result=switch(op){
case "+"->num1+num2;
case "-"->num1-num2;
case "*"->num1*num2;
case "/"->num1/num2;
default-> -1;

};
System.out.println(num1 + op + num2+ " = "+  result);
}
}