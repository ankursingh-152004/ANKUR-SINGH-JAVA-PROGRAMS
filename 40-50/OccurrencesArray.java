import java.util.*;
class OccurrencesArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME OCCURRENCES ARRAY....\n");
System.out.print("Please Enter the Number Of Element Of Array:");
int size=sc.nextInt();
int[] nums=new int[size];
int i=0;
while(i<size){
System.out.print("Please Enter the Element Number " +(i+1) +": ");
nums[i]=sc.nextInt();
i++;
}
System.out.print("Please Enter the Number You Want To Find:");
int n=sc.nextInt();
int occurrences=noOfOccurrences(nums,n);
System.out.println(" YOUR NUMBER "+n+" WAS FOUND "+occurrences+" TIMES IN THE ARRAY");
}
public static int noOfOccurrences(int[] nums,int n)
{
int occ=0;
int i=0;
while(i<nums.length){
if(nums[i]==n){
occ++;
}
i++;
}
return occ;
}
}