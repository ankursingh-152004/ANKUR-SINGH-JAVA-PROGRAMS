import java.util.*;
class SumAvg2DArray
{
public static void main(String[]  args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO SUM AND AVERAGE OF ELEMENT IN 2D ARRAY....");
System.out.print("Please, Enter the Number of Rows:");
int rows=sc.nextInt();
System.out.print("Please, Enter the Number of Columns:");
int columns=sc.nextInt();
int[][] numArr=new int[rows][columns];
int i=0;
while(i<rows){
int j=0;
while(j<columns){
System.out.print("Please,Enter the Row Number " + (i+1) +" And Column Number "+(j+1)+" : ");
numArr[i][j]=sc.nextInt();
j++;
}
i++;
}
long sum=sum(numArr);
double avg=avg(numArr);
System.out.println("Your Sum Of Array Is: "+ sum);
System.out.println("Your Average Of Array Is: "+ avg);
}
public static long sum(int[][] numArr)
{
int i=0;
long sum=0;
while(i<numArr.length){
int j=0;
while(j<numArr[i].length){
sum+=numArr[i][j];
j++;
}
i++;
}
return sum;
}
public static double avg(int[][] numArr)
{
if(numArr.length==0){
return 0;
}
int rows=numArr.length;
int columns=numArr[0].length;
double size=rows*columns;
return sum(numArr)/size;
}
}