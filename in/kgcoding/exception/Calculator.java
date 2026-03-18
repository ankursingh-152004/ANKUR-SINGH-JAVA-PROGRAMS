package in.kgcoding.exception;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Division Calculator/n");
        System.out.print("Please Enter First number: ");
        int first=sc.nextInt();
        System.out.print("Please Enter Second number: ");
        int second=sc.nextInt();
        
        try{
            int result =first/second;
            System.out.println("Result is "+result);
        }catch(ArithmeticException exception){
            System.out.println("Are Bhaiya Zero se Divide mat karo....");
            System.out.printf("%s ",exception.getMessage());
        }
        sc.close();
    }
}
