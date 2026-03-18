package in.kgcoding.PassBy;

public class TestPassByValue {

    //PASS By Value-->it make a copy of a variable...if change of vlaue new method doesn't change the value in original method.
    //PASS By Reference--->It widely used with objects and make a reference of it.....if change of vlaue new method then it also change the value in original method.
  
    public static void main(String[] args) {
        int x=1;
        int y=4;
        int sum=add(x,y);
        System.out.printf("x=%d, y=%d,sum=%d",x,y,sum);
    }
    public static int add (int a,int b){
         a+=b;
         return a;
    }

}
 