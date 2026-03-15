import java.util.*;
class Palindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to  Palindrome Number \n");
System.out.print("Please Enter a number :");
int num=sc.nextInt();
boolean isPalindrome=isPalindrome(num);
if( isPalindrome)
{
System.out.println("Your number is Palindrome Number...");
}
else{
System.out.println("Your number is not a Palindrome Number...");
}
}
public static boolean isPalindrome(int num)
{
int reverse=reverse(num);
return num==reverse;
}
public static int reverse(int num)
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