package in.kgcoding.Functional_Programming.Stream;

import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        List<Integer>  numbers=List.of(1,3,4,5,6,7);
       int newSum= numbers.stream()
               .reduce(0,new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer integer,Integer integer2){
                    return integer+integer2;
                }
               });
               System.out.printf("\n Sum using Reduce is %d",newSum);

               //Using Lambda Expression
               int newSum2=numbers.stream().reduce(0, (a,b) -> a+b);
                System.out.printf("\n Sum using Reduce with lambda expression is %d",newSum2);
    }

}
