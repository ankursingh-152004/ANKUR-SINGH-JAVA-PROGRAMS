package in.kgcoding.polymorphism;

public class Overloading {
    // METHOD/CONSTRUCTOR OVERLOADING(COMPILE TIME POLYMORPHISM)
    // multiple methods with same name in same class but different parameter or Differnt Datatype
    public int sum(int a,int b){
        return a+b;
    }

     public int sum(int a,int b,int c,int d){
        return a+b;
    }
    public String sum(String a,String b){
        return a.concat(b);
    }
    public static void main(String[] args) {
        Overloading overloading=new Overloading();
    System.out.println(overloading.sum(4, 5));
    System.out.println(overloading.sum(1, 2, 4, 5));
    System.out.println(overloading.sum("ANKUR ","SINGH"));
    }
}
