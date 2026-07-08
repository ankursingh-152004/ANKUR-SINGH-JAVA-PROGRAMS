package in.kgcoding.Challenge112;

import java.util.Optional;

public class OptinalClass {
    public static void main(String[] args) {
        System.out.println(opt(null));
        System.out.println(opt(""));//empty
        System.out.println(opt("pop"));
    }
    public static Optional<String> opt(String str){
        if(str==null||str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }

}
