import java.util.*;
class SumPositive{
public static void main(String[] args){
System.out.println("Welcome to Adding Positive Number..");
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Size of Array: ");
int size=sc.nextInt();
int[] Arr=new int[size];
int i=0;
while(i<size){
System.out.print("Please, Enter the element number "+(i+1)+": ");
Arr[i]=sc.nextInt();
i++;
}
int j=0;
System.out.print("Your Array is : [ ");
while(j<Arr.length){
System.out.print(Arr[j]+ " ");
j++;
}
System.out.println("]");
int sum=0;
for(int num:Arr)
{
if(num<0){
continue;
}
sum+=num;
}
System.out.print("SUM OF POSITIVE NUMBER OF THE ARRAY: "+sum);
}
}
