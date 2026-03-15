import java.util.*;
class PasswordChecker{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO SET YOUR PASSWORD....");
String password;
do{
System.out.print("Please, Enter your Password:");
 password=sc.next();
}while(!isValidPassword(password));
System.out.println("THANKS FOR ENTERING VALID PASSWORD....");
}
public static boolean isValidPassword(String password){
return password.length() > 6;
}
}

