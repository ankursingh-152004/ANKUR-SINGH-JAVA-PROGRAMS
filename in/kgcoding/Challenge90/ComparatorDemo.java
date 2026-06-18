package in.kgcoding.Challenge90;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Ankur","Sohit","Rahul");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);

    }
    public static void sortInDescending(List<String> str){
        Collections.sort(str, new Comparator<String>() {
           @Override
            public  int compare(String s,String t){
                if(s.equals(t)) return 0;
                else if(s.charAt(0)<t.charAt(0)) return 1;
                else return -1;
            }
        });
    }

}
