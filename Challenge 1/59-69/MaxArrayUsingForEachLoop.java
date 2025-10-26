import java.util.*;
class MaxArrayUsingForEachLoop{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num;
System.out.println("WELCOME TO FINDING MAXIMUM VALUE FROM GIVEN ARRAY USING FOR EACH LOOP...\n");
System.out.print("PLease, Enter the Size Of Array : ");
int size=sc.nextInt();
int[] Arr=new int[size];
int i=0;
while(i<size)
{
System.out.print("Enter the Element number "+(i+1)+ " : ");
Arr[i]=sc.nextInt();
i++;
}
int max=Integer.MIN_VALUE;
for(int n:Arr){
if(max<n){
max=n;
}
}
System.out.println("MAXIMUM NUMBER IS "+ max);
}
}