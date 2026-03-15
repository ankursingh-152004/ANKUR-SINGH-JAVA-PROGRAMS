import java.util.*;
class PrimeUsingForLoop{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num;
System.out.println("WELCOME TO PRIME NUMBER CHECKER USING FOR LOOP...\n");
System.out.print("PLease, Enter the Number : ");
num=sc.nextInt();
boolean isPrime=isPrime(num);
System.out.println("YOUR NUMBER IS "+(isPrime?" PRIME ":" NOT PRIME "));
}
public static boolean isPrime(int num)
{
if(num<=1)
{
return false;
}
for(int i=2;i<num;i++)
{
if(num%i==0)
{
return false;
}
}
return true;
}
}