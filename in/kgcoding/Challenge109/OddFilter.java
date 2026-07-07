package in.kgcoding.Challenge109;

import java.util.List;

public class OddFilter {
    public static void main(String[] args) {
        List<Integer> num=List.of(1,2,3,4,5,6,7,8,9);
        num.stream().filter(n -> n%2==1).forEach(n-> System.out.println(n));
    }

}
