import java.util.*;
class Prime
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
{
System.out.println("Wel com to Prime Number checker....\n");
System.out.print("Enetr the Number:");
int num=sc.nextInt();
boolean isPrime=isPrime(num);
if(isPrime)
{
System.out.println("YOUR NUMBER IS PRIME...");
}else{
System.out.println("YOUR NUMBER IS NOT PRIME...");
}
}
}
public static boolean isPrime(int num)
{
int i=2;
while(i<num)
{
if(num%i==0)
{
return false;
}
i++;
}
return true;
}
}