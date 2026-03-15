import java.util.*;
class AbsoluteTernary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO FINDING MINIMUM.....\n");
System.out.print("PLease, Enter the  Number:");
int num1=sc.nextInt();
AbsoluteTernary ternary=new AbsoluteTernary();
int absolute=ternary.absoluteTernary(num1);
System.out.println("ABSOLUTE NUMBER IS: "+absolute);
}
public int absoluteTernary(int num1){
int abs=num1<0?num1=-num1:num1;
return abs;
}
}