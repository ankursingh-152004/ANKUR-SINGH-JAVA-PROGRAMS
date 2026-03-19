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
        }catch(ArithmeticException exception){  //There can be more than one catch block.
            System.out.println("Are Bhaiya Zero se Divide mat karo....");
            System.out.printf("%s ",exception.getMessage());
        }catch(Throwable th){
            System.out.println("General Exception");
        }finally{
            System.out.println("Finally Over");
        }
        sc.close();
    }
}
//TYPES OF EXCEPTION---> 1. USER DEFINED EXCEPTION
//                  ---> 2. BUILT-IN-EXCEPTION----->1. CHECKED AND 2.UNCHECKED
//Checked exception need to be handle immediately by user whereas unchecked may or may not be handled.


