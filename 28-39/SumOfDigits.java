import java.util.*;
class SumOfDigits
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Sum Of Digits \n");
System.out.print("Please Enter a number :");
int num=sc.nextInt();
int sum=sumOfDigits(num);
System.out.print("SUM OF DIGITS OF NUMBERS  "+    num   +    "  is  "   + sum);
}
public static int sumOfDigits(int num)
{
 int sum=0;
while(num>0)
{
int d=num%10;
sum=sum+d;
num=num/10;
}
return sum;
}
}