package in.kgcoding.Challenge107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names=List.of("Ankur","aman","Cow");
        names.stream()
            .forEach(naam -> System.out.println(naam));
    }

}
