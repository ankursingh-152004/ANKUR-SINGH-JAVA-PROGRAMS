package in.kgcoding.Challenge92;

import java.util.Arrays;
import java.util.List;

public class Swap {

    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(1,2,3,4,23,24);
        System.out.println(l);
        swapOfNumbers(l, 2,3);
        System.out.println(l);
    }
    public static void swapOfNumbers(List<Integer> list,int x,int y){
        int temp=list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    

    }

}
