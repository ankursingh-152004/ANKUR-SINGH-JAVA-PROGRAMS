import java.util.*;
class ReverseOfDigits
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Reverse Of Digits \n");
System.out.print("Please Enter a number :");
int num=sc.nextInt();
int reverse=reverseOfDigits(num);
System.out.print("reverse OF DIGITS OF NUMBERS  "+    num   +    "  is  "   + reverse);
}
public static int reverseOfDigits(int num)
{
 int r=0;
while(num>0)
{
int d=num%10;
r=r*10+d;
num=num/10;
}
return r;
}
}