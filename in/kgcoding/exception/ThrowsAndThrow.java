package in.kgcoding.exception;

public class ThrowsAndThrow { //Throws--->Declares that a method may throw a one or more exception.It need method calling to handle or futher declare.
                              //Throw---->it is used to throw an exception from any method or block of code.you can throw either new instance or existing exception object using throw.


    public void printName(String name) throws IllegalArgumentException{
        if(name.contains("-")){
            throw new IllegalArgumentException("Name contains -");

        }
        System.out.println(name);
    }
    public static void main(String[] args) {
        ThrowsAndThrow th=new ThrowsAndThrow();
        th.printName("Ankur-Singh");
    }

}
