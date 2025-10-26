import java.util.*;
class NumberGuessingGame{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int guess,num=5;
System.out.println("WELCOME NUMBER GUESSING GAME...\n");
do{
System.out.print("Please, Enter the Number between 0 and 10: ");
guess=sc.nextInt();
}while(num!=guess);
System.out.println("YOU HAVE SUCCESSFULY GUESSED THE NUMBER...");
}
}