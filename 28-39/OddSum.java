import java.util.*;
class OddSum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Odd Sum \n");
System.out.print("Please Enter a number :");
int num=sc.nextInt();
int sum=oddSum(num);
System.out.print("SUM OF ODD NUMBERS FROM 1 TO  "+    num   +    "  is  "   + sum);
}
public static int oddSum(int num)
{
int i=1;
int sum=0;
while(i<=num)
{
sum=sum+i;
i=i+2;
}
return sum;
}
}