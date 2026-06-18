package in.kgcoding.Challenge95;

import java.util.HashSet;
import java.util.Scanner;
public class UniqueCharacter {

    public static void main(String[] args) {
        HashSet<Character> unique =new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your String: ");
        String str=sc.next();

     for (char ch : str.toCharArray()) {
        unique.add(ch);
     }
     System.out.printf("your String has %d Characters",unique.size());
sc.close();
        
    }


}
