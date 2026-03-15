import java.util.*;
class LCM
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to LCM \n");
System.out.print("Please Enter a number1 :");
int num1=sc.nextInt();
System.out.print("Please Enter a number2 :");
int num2=sc.nextInt();
int result=lcm(num1,num2);
System.out.print("LCM OF TWO NUMBERS  "+    num1  + "  AND  "+ num2  +    "  is  "   + result);
}
public static int lcm(int num1,int num2)
{
int i=1;
while(i<=num2)
{
int factor=num1*i;
if(factor%num2==0)
{
return factor;
}
i++;
}
return 0;
}
}