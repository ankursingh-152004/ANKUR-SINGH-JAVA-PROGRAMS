import java.util.*;
class LoopPattern
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Loop Pattern...\n" );
System.out.print(" Please Enter the Number Of rows:");
int rows=sc.nextInt();
printFirstPattern(rows);
printSecondPattern(rows);
}
public static void printFirstPattern(int rows){
System.out.println("Here is First pattern...\n");
int r=0;
while(r<rows)
{
System.out.print("*");
int i=0;
while(i<r){
System.out.print(" *");
i++;
}
System.out.println();
r++;
}
}
public static void printSecondPattern(int rows){
System.out.println("Here is second pattern...\n");
int r=rows;
while(r>0)
{
int i=0;
while(i<r){
System.out.print("* ");
i++;
}
System.out.println();
r--;
}
}
public static void printThirdPattern(int rows){
System.out.println("Here is third pattern...\n");
int r=rows;
while(r>0)
{
int i=0;
while(i<r){
System.out.print("* ");
i++;
}
System.out.println();
r--;
}
}
} 
