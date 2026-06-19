package in.kgcoding.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Ankur");
        l.add(1,"Singh");
         for(int i=0;i<l.size();i++){
             System.out.println(l.get(i));
        }
        l.remove(1);
       if( l.contains("Ankur")){
        System.out.println("Existed...");
        
        System.out.println(l.indexOf("Ankur") );
       }
    }
}
