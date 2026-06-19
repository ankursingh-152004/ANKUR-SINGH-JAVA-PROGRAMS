package in.kgcoding.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {//collection is interface whereas collection is a utility class


    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<>();
        numList.add(9);
        numList.add(2);
        numList.add(6);
        numList.add(-123);
        System.out.print("Before using Collections :");
        for (Integer i : numList) {
            System.out.print(" " + i);
        }
            System.out.println("");

        Collections.sort(numList);
        System.out.print("After Using Collection :");
        for (Integer i : numList) {
            System.out.print(" " + i);
        }
            System.out.println("");

        Collections.shuffle(numList);
         for (Integer i : numList) {
            System.out.print(" " + i);
        }

            System.out.println("");

        Collections.shuffle(numList);
         for (Integer i : numList) {
            System.out.print(" " + i);
        }
        List<Integer> unmodifiableList=Collections.unmodifiableList(numList);
      //  numList.add(9)    error
      for (Integer unmodifiableList2 : unmodifiableList) {
        System.out.println(unmodifiableList2);
      }

    }



}
