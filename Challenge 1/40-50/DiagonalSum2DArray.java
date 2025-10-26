import java.util.*;
class DiagonalSum2DArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO SUM OF DIAGONAL ELEMENTS IN 2D ARRAY...");
System.out.print("Please,Enter the Number of Rows: ");
int rows=sc.nextInt();
System.out.print("Please,Enter the Number of Columns: ");
int columns=sc.nextInt();
int[][] numArr=new int[rows][columns];
int i=0;
while(i<rows){
int j=0;
while(j<columns){
System.out.print("Enter the Row number "+ (i+1)+"  And Column number "+ (j+1)+ " :--");
numArr[i][j]=sc.nextInt();
j++;
}
i++;
}
long sum=sumDiagonal(numArr);
System.out.println("Sum of Diagonal Element: "+ sum);
}
public static long sumDiagonal(int[][]  numArr)
{
long leftSum=sumLeftDiagonal(numArr);
long rightSum=sumRightDiagonal(numArr);
long sum=leftSum+rightSum;
if(numArr.length%2 != 0){
int index=numArr.length/2;
sum=sum-numArr[index][index];
}
return sum;
}
public static long sumLeftDiagonal(int[][]  numArr)
{
long leftSum=0;
int  i=0;
while(i<numArr.length){
leftSum+=numArr[i][i];
i++;
}
return leftSum;
}
public static long sumRightDiagonal(int[][]  numArr)
{
long rightSum=0;
int i=0;
while(i<numArr.length){
int col=numArr.length-1-i;
rightSum+=numArr[i][col];
i++;
}
return rightSum;
}
}