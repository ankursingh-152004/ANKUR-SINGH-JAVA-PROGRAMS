package in.kgcoding.Challenge111;

import java.util.stream.IntStream;

public class TestingFactorial {//using functional programming

    public static void main(String[] args) {
        System.out.println("Factorial using two ways");
        System.out.println("Procedural way"+fact(9));
        int n=9;
        IntStream.rangeClosed(2, n)
        .reduce((a,b)->a*b).ifPresent(System.out::println);
    }
    public static int fact(int num){
        if(num==0||num==1) return 1;
        int f=1;
        for(int i=2;i<=num;i++){
            f*=i;
        }
        return f;
    }

}
