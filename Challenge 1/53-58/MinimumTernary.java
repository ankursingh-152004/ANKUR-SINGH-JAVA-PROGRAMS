import java.util.*;
class MinimumTernary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO FINDING MINIMUM.....\n");
System.out.print("PLease, Enter the First  Number:");
int num1=sc.nextInt();
System.out.print("Please, Enter the Second Number:");
int num2=sc.nextInt();
MinimumTernary ternary=new MinimumTernary();
int min=ternary.minTernary(num1,num2);
System.out.println("MINIMUM NUMBER IS: "+min);
}
public int minTernary(int num1,int num2){
int min=num1>num2?num2:num1;
return min;
}
}


