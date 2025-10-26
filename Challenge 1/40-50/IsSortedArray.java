import java.util.*;
class IsSortedArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO ARRAY SORTING CHECKPOST....\n");
System.out.print("Please Enter the Number Of Element Of Array:");
int size=sc.nextInt();
int[] nums=new int[size];
int i=0;
while(i<size){
System.out.print("Please Enter the Element Number " +(i+1) +": ");
nums[i]=sc.nextInt();
i++;
}
boolean inc=isIncreasing(nums);
boolean dec=isDecreasing(nums);
if(inc || dec)
{
System.out.println("YOUR ARRAY IS SORTED...");
}
else
{
System.out.println("YOUR ARRAY IS NOT SORTED...");
}
}
public static boolean isIncreasing(int[] nums)
{
int i=1;
while(i<nums.length){
if(nums[i]<nums[i-1])
{
return false;
}
i++;
}
return true;
}
public static boolean isDecreasing(int[] nums)
{
int i=1;
while(i<nums.length){
if(nums[i]>nums[i-1])
{
return false;
}
i++;
}
return true;
}
}
