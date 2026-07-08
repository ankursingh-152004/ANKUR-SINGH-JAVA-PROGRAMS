package in.kgcoding.Functional_Programming;

import java.util.List;

public class MethodReferences {//It is Described using ::
    public static void main(String[] args) {
        List<Integer> num=List.of(1,2,3,4,5,6,7,8,9);
        num.stream().filter(n -> n%2==1).forEach(System.out::println);

        //String::toLOwerCase
        //String::compareTo
        //Person::comapreByAge


    }

}
