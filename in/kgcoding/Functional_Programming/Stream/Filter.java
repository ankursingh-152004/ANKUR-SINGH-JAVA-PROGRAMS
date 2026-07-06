package in.kgcoding.Functional_Programming.Stream;

import java.util.List;
import java.util.function.Consumer;

public class Filter {
    public static void main(String[] args) {
        List<String> fruits=List.of("Apple","Banana","cherry","date");
        System.out.println(fruits.size());
        System.out.println("Printing using Traditional Method....");

        for (String s : fruits) {
            System.out.println(s);
        }
        System.out.println("Printing using Streams....");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruits){
                System.out.println(fruits);
            }
        });

        //OTher Method Using Lamda Expression
        System.out.println("Printing using Filter in Streams....");
         fruits.stream()
        .filter(fruits1->fruits1.endsWith("a"))//it is not a terminal operation and it does not store operations when it is not called on Terminal Operation.(Lazy Operation)
        .forEach(fruits1 -> System.out.println(fruits1));//forEach is a Terminal operation 
    }

}
