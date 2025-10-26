import java.util.*;
class ReverseArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO ARRAY REVERSE....\n");
System.out.print("Please Enter the Number Of Element Of Array:");
int size=sc.nextInt();
int[] nums=new int[size];
int i=0;
while(i<size){
System.out.print("Please Enter the Element Number " +(i+1) +": ");
nums[i]=sc.nextInt();
i++;
}
reverseArr(nums);
System.out.println("Here is Your Reverse Array...");
int j=0;
while(j<nums.length)
{
System.out.print( nums[j] + " ");
j++;
}
System.out.println();
}
public static void reverseArr(int[] nums)
{
int i=0;
while(i<nums.length/2){
int swap=nums[i];
nums[i]=nums[(nums.length-1) -i];
nums[(nums.length-1) -i]=swap;
i++;
}
}
}