package in.kgcoding.Challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryNames {
    public static void main(String[] args) {
        Map<String,String> countryMap=new HashMap<>();
        countryMap.put("Bharat","New Delhi");
        countryMap.put("Pakistan","Islamabad");
        countryMap.put("Japan","Tokyo");
        countryMap.put("China","Beijing");
        countryMap.put("SriLanka","Columbo");

        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Country Name :");
        String country=sc.next();
        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s",country,countryMap.get(country));
        }else{
            System.out.println("Sorry We Don't Know the capital.");
        }
        sc.close();

    }
}
