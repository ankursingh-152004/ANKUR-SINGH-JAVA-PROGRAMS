package in.kgcoding.Challenge93;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import in.kgcoding.Challenge92.Swap;

public class ListReverse {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,44);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
    public static void reverse(List<Integer> list){
        // Collections.reverse(list);
        //or Another method

        for(int i=0;i<list.size()/2;i++){
            Swap.swapOfNumbers(list, i, list.size()-1-i);
        }
    }

}
