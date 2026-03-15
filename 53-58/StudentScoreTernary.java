import java.util.*;
class StudentScoreTernary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME To Student's Score usinng Ternary....\n");
System.out.print("PLease, Enter the Student's Score:");
int num=sc.nextInt();
StudentScoreTernary ternary=new StudentScoreTernary();
String score=ternary.studentScoreTernary(num);
System.out.println("STUDENT'S GRADE IS: "+score);
}
public String studentScoreTernary(int num){
String score=num>80?"HIGH":((num>50 && num<=80)?"MODERATE":"LOW");
return score;
}
}