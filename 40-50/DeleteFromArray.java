import java.util.*;
class DeleteFromArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO ARRAY ELEMENT DELETION....\n");
System.out.print("Please Enter the Number Of Element Of Array:");
int size=sc.nextInt();
int[] nums=new int[size];
int i=0;
while(i<size){
System.out.print("Please Enter the Element Number " +(i+1) +": ");
nums[i]=sc.nextInt();
i++;
}
System.out.print("NOW,ENTER THE NUMBER YOU WANT TO DELETE: ");
int numToDelete=sc.nextInt();
int[] newArr=deleteNumber(nums,numToDelete);
System.out.println("Here is Your new Array...");
int j=0;
while(j<newArr.length)
{
System.out.print( newArr[j] + " ");
j++;
}
System.out.println();
}
public static int noOfOccurrences(int[] nums,int numToDelete)
{
int occ=0;
int i=0;
while(i<nums.length){
if(nums[i]==numToDelete){
occ++;
}
i++;
}
return occ;
}
public static int[] deleteNumber(int[] nums,int numToDelete)
{
int occ=noOfOccurrences( nums, numToDelete);
if(occ==0)
{
return nums;
}
int newSize=nums.length-occ;
int[] newArr=new int[newSize];
int i=0,j=0;
while(i<nums.length)
{
if(nums[i]!=numToDelete)
{
newArr[j]=nums[i];
j++;
}
i++;
}
return newArr;
}
}