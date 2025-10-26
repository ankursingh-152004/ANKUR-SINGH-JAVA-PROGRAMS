import java.util.*;
class PalindromeArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO PALINDROME ARRAY ....\n");
System.out.print("Please Enter the Number Of Element Of Array:");
int size=sc.nextInt();
int[] nums=new int[size];
int i=0;
while(i<size){
System.out.print("Please Enter the Element Number " +(i+1) +": ");
nums[i]=sc.nextInt();
i++;
}
boolean result=palindromeArr(nums);
if(result){
System.out.println("It is a Palindrome Array...");
}
else{
System.out.println("Not a Palindrome Array...");
}
}
public static boolean palindromeArr(int[] nums)
{
int i=0;
while(i<nums.length /2){
if(nums[i]!=nums[nums.length-1-i])
{
return false;
}
i++;
}
return true;
}
}