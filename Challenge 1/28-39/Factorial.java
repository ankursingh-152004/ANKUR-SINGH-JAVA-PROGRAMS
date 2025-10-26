import java.util.*;
class Factorial
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Factorial....\n");
System.out.print("Please Enter a number :");
int num=sc.nextInt();
long result=fact(num);
System.out.print("FACTORIAL OF  "+    num   +    "  is  "   + result);
}
public static long fact(int num)
{
if(num<2)
{
return 1;
}
long result=1;
int i=2;
while(i<=num)
{
result=result*i;
i++;
}
return result;
}
}
