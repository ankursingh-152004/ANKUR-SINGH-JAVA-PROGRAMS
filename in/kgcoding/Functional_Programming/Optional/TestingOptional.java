package in.kgcoding.Functional_Programming.Optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,43,2,1,3,4);
        Optional<Integer> newSum=numbers.stream()
        .reduce((a,b)->a+b);
        if(newSum.isPresent()){
            System.out.println(newSum.get());
        }else{
            System.out.println("Empty");
        }
    }

}
//Creating Optional Objects:
//1. Optional.empty() 2. Optional.of() 3.Optional.ofNullable()

//isPresent() and ifPresent()----checking value presence
//orElse() and orelseGet()----default value
//map()--value transformation
//orElseThrow--exception