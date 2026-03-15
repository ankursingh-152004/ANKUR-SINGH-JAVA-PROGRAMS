import java.util.*;
class Course{
static int maxCapacity;
String courseName;
int enrollments;
static{
maxCapacity=100;
}
Course(String courseName){
this.courseName=courseName;
this.enrollments=0;
}
String[]  enrolledStudents=new String[maxCapacity];
static void setMaxCapacity(int  maxCapacity)
{
Course.maxCapacity=maxCapacity;
}
void enrollStudent(String studentName){
enrolledStudent[enrollments]=studentName;
enrollments++;
}
void unenrollStudent(String studentName){
System.out.println("STUDENT REMOVED...");
enrollments--;
}
}


