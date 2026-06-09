package in.kgcoding.Challenge91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        
        List<Integer> l=Arrays.asList(1,2,3,2,3,2,1,2,3,2,3);
        System.out.println(Collections.frequency(l, 2));
        System.out.println(Collections.frequency(l, 3));
        System.out.println(Collections.frequency(l, 7));

    }

}
