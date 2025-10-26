import java.util.*;
class OccurrencesInArrayUsingForEachLoop{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num;
System.out.println("WELCOME TO FINDING OCCURRENCES OF VALUE FROM GIVEN ARRAY USING FOR EACH LOOP...\n");
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
System.out.print("Please, Enter the number you want to search: ");
num=sc.nextInt();
int count=countOccurrences(Arr,num);
if(count==0){
System.out.println("YOU NUMBER WAS NOT FOUND IN THE ARRAY....");
}
else{
System.out.println("YOU NUMBER WAS FOUND "+count+" TIMES IN THE ARRAY....");
}
}
public static int countOccurrences(int[] Arr,int num)
{
int count=0;
for(int n: Arr){
if(n == num){
count++;
}
}
return count;
}
}