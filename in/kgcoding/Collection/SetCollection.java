package in.kgcoding.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {//Don't contains Duplicates but it can be unoredered or ordered.

    public static void main(String[] args) {
        
        Set<String> names=new HashSet<>();
        System.out.println(names.add("ankur"));//return true
        System.out.println(names.add("Singh"));//true
        System.out.println(names.add("ankur"));//return false(duplicate)
        System.out.println(names.size());//2
        System.out.println((names.remove("ankur")));//true
        System.out.println(names.contains("ankur"));//false
    }

}
