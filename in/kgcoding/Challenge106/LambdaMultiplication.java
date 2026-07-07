package in.kgcoding.Challenge106;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
public static void main(String[] args) {
    BinaryOperator<Integer> multi=(a,b)->a*b;
    int res=multi.apply(4,6);
    System.out.println("multiplication is "+res);
    
}   
}
