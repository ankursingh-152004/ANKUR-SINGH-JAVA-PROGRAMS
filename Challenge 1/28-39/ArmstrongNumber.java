import java.util.*;
class ArmstrongNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to  ArmstrongNumber \n");
System.out.print("Please Enter a number :");
int num=sc.nextInt();
boolean isArmstrong=isArmstrong(num);
if( isArmstrong)
{
System.out.println("Your number is Armstrong Number...");
}
else{
System.out.println("Your number is not a Armstrong Number...");
}
}
public static boolean isArmstrong(int num)
{
int noOfDigits=noOfDigits(num);
int finalNumber=0;
int n=num;
while(num>0){
int lastDigit=num%10;
num /=10;
finalNumber+= pow(lastDigit,noOfDigits);
}
return finalNumber == n ;
}
public static int noOfDigits(int num)
{
 int digits=0;
while(num>0)
{
digits++;
num=num/10;
}
return digits;
}
public static int pow(int num1,int num2)
{
int result=1;
int i=0;
while(i<num2)
{
result=result*num1;
i++;
}
return result;
}
}