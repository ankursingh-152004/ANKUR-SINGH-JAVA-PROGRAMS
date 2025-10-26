import java.util.*;
class OddEvenTernary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO ODD AND EVEN.....\n");
System.out.print("PLease, Enter the First  Number:");
int num1=sc.nextInt();
OddEvenTernary ternary=new OddEvenTernary();
String result=ternary.oddEvenTernary(num1);
System.out.println("YOUR NUMBER IS "+result);
}
public String oddEvenTernary(int num1){
String result=num1 %2==0 ?"EVEN":"ODD";
return result;
}
}