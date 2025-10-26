import java.util.*;
class MonthSwitch{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO MONTH OF THE YEAR....\n");
System.out.print("PLease, Enter the  Month Number(1-12):");
int monthNum=sc.nextInt();
String nameOfMonth=getMonthName(monthNum);
System.out.println("Your Month Name is " +nameOfMonth);
}
public static String getMonthName(int monthNum)
{
String monthName=switch(monthNum){
case 1->"JANUARY";
case 2->"FEBRUARY";
case 3->"MARCH";
case 4->"APRIL";
case 5->"MAY";
case 6->"JUNE";
case 7->"JULY";
case 8->"AUGUST";
case 9->"SEPTEMBER";
case 10->"OCTOBER";
case 11->"NOVEMBER";
case 12->"DECEMBER";
default->"INVALID Month";
};
return monthName;
}
}

