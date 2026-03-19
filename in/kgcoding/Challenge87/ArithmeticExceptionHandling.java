package in.kgcoding.Challenge87;
import java.util.*;

public class ArithmeticExceptionHandling {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Challenge 87");
        System.out.print("Enter first Number :");
        int first=sc.nextInt();
        System.out.print("Enter Second Number :");
        int second=sc.nextInt();

        try{
            int result =first/second;
            System.out.printf("%d / %d = %d" ,first,second,result); 
        }catch(ArithmeticException a){
            System.out.println("Divison By Zero is not Allowed");
        }
        sc.close();
    }

}
