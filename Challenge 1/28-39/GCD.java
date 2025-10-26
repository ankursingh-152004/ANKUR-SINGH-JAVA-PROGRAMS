import java.util.*;
class GCD
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to LCM \n");
System.out.print("Please Enter a number1 :");
int num1=sc.nextInt();
System.out.print("Please Enter a number2 :");
int num2=sc.nextInt();
int result=gcd(num1,num2);
System.out.print("GCD OF TWO NUMBERS  "+    num1  + "  AND  "+ num2  +    "  is  "   + result);
}
public static int gcd(int num1,int num2)
{
int gcd=1;
int least=least(num1,num2);
int i=2;
while(i<=least)
{
if(num1%i==0 &&num2%i==0)
{
gcd= i;
}
i++;
}
return gcd;
}
public static int least(int num1,int num2)
{
if(num1<num2)
{
return num1;
}
else
{
return num2;
}
}
}