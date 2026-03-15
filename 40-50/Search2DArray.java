import java.util.*;
class Search2DArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO SEARCHING IN 2D ARRAY...");
System.out.print("Please, Enetr the Number Of Rows :");
int rows=sc.nextInt();
System.out.print("Please, Enter the Number of Columns :");
int columns=sc.nextInt();
int[][] numArr=new int[rows][columns];
int i=0;
while(i<rows)
{
int j=0;
while(j< columns)
{
System.out.print("Please, Enter the Row Number "+(i+1)+" And "+"Column Number "+ (j+1)+
" : ");
numArr[i][j]=sc.nextInt();
j++;
}
i++;
}
System.out.print("Please, Enter the Number To Be Searched: ");
int num=sc.nextInt();
boolean result=search(numArr,num);
if(result){
System.out.println("Your Number Was Found...");
}else{
System.out.println("Your Number Was Not Found..");
}
}
public static boolean search(int[][] numArr,int num)
{
int i=0;
while(i<numArr.length)
{
int j=0;
while(j<numArr[i].length){
if(numArr[i][j]==num){
return true;
}
j++;
}
i++;
}
return false;
}
} 
