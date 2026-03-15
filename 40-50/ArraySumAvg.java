import java.util.*;
class ArraySumAvg
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO ARRAY SUM AND AVERAGE....\n");
System.out.print("Please Enter the Number Of Element Of Array:");
int size=sc.nextInt();
int[] nums=new int[size];
int i=0;
while(i<size){
System.out.print("Please Enter the Element Number " +(i+1) +": ");
nums[i]=sc.nextInt();
i++;
}
long sum=sumArr(nums);
int avg=avgArr(nums);
System.out.println("SUM OF THE NUMBERS IS:"+sum);
System.out.println("AVERAGE OF THE NUMBERS IS:"+avg);
}
public static long sumArr(int[] nums)
{
long sum=0;
int i=0;
while(i<nums.length){
sum=sum+nums[i];
i++;
}
return sum;
}
public static int avgArr(int[] nums)
{
long sum=sumArr(nums);
int avg=(int) (sum /nums.length);
return avg;
}
}


