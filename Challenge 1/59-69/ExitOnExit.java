import java.util.*;
class ExitOnExit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(true){
System.out.print("Enter your command: ");
String command=sc.nextLine();
if(command.equalsIgnoreCase("exit")){
break;
}
}
System.out.println("You Have Been Successfully Exited...");
}
}