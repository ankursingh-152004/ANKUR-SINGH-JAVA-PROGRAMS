import java.util.*;
class MergeTwoArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO MERGING SORTED ARRAY ....\n");
System.out.print("Please Enter the Number Of Element Of First Array:");
int size1=sc.nextInt();
int[] nums1=new int[size1];
int i=0;
while(i<size1){
System.out.print("Please, Enter the Element Number " +(i+1) +": ");
nums1[i]=sc.nextInt();
i++;
}
System.out.print("Please Enter the Number of Element of Second Array:");
int size2=sc.nextInt();
int[] nums2=new int[size2];
int j=0;
while(j<size2){
System.out.print("Please, Enter the Element Number "+(j+1)+" : ");
nums2[j]=sc.nextInt();
j++;
}
int[] mergeArr=merge(nums1,nums2);
System.out.println("Here is Your Merge Array...");
int k=0;
while(k<mergeArr.length)
{
System.out.print(mergeArr[k]+" ");
k++;
}
}
public static int[] merge(int[] nums1,int[] nums2)
{
int newSize=nums1.length+nums2.length;
int[] newArr=new int[newSize];
int i=0,j=0,k=0;
while(i<nums1.length || j<nums2.length)
{
if(j==nums2.length||(i<nums1.length && nums1[i]<nums2[j]))
{
newArr[k]=nums1[i];
i++;
k++;
}else{
newArr[k]=nums2[j];
k++;
j++;
}
}
return newArr;
}
}

