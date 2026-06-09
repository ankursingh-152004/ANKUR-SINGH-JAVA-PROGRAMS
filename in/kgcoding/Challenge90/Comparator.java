package in.kgcoding.Challenge90;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Ankur","Sohit","Rahul");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);

    }
    public static void sortInDescending(List<String> str){
        Collections.sort(str, new java.util.Comparator<String>() {
           @Override
            public  int comapare(String s,String t){
                if(s.equals(t)) return 0;
                else if(s.charAt(0)<t.charAt(0)) return 1;
                else return -1;
            }
        });
    }

}
