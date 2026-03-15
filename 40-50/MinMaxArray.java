import java.util.*;
class MinMaxArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME Minimum And MAximum ARRAY....\n");
System.out.print("Please Enter the Number Of Element Of Array:");
int size=sc.nextInt();
int[] nums=new int[size];
int i=0;
while(i<size){
System.out.print("Please Enter the Element Number " +(i+1) +": ");
nums[i]=sc.nextInt();
i++;
}
int min=minArr(nums);
System.out.println("MINIMUM NUMBER OF THE ARRAY IS:"+min);
int max=maxArr(nums);
System.out.println("MAXIMUM NUMBER OF THE ARRAY IS:"+max);
}
public static int minArr(int[] nums)
{
if(nums.length==0)
{
return Integer.MIN_VALUE;
}
int i=1;
int min=nums[0];
while(i<nums.length){
if(min>nums[i]){
min=nums[i];
}
i++;
}
return min;
}
public static int maxArr(int[] nums)
{
if(nums.length==0)
{
return Integer.MAX_VALUE;
}
int i=0;
int max=nums[0];
while(i<nums.length){
if(max<nums[i]){
max=nums[i];
}
i++;
}
return max;
}
}

