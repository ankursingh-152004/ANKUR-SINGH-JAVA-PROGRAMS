package in.kgcoding.Challenge108;

import java.util.List;

public class FilterAndConcate {
    public static void main(String[] args) {
        List<String> strs=List.of("Ankur Singh Is Best Developor","And Kg Coding IS Best YoutubeChannel","bad","Hello");
        String concate=strs.stream().filter(str->str.length()>=10).reduce("", (a,b)->a+" "+b);
        System.out.println(concate);
    }

}
