package in.kgcoding.Challenge85;

public class Calculator {

    public int add(int a,int b){
        return a+b;
    }

    
    public int add(int a,int b,int c){
        return a+b+c;
    }
    
    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("Sum OF Number is "+calculator.add(3, 4));
        System.out.println("Sum OF Number is "+calculator.add(3, 4,5));
        System.out.println("Sum OF Number is "+calculator.add(3.5, 4.4));

    }
}
