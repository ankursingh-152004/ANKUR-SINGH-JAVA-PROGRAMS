package in.kgcoding.Wrapper;

public class Wrapper { // provide a way to use primitive datat types like int,char,boolean,etc as OBJECTS.

    public static void main(String[] args) {
        Integer first=Integer.valueOf("55");   //or Integer a=55; (automatic conversion or Autoboxing) primitive to wrapper class object

        int secont=first; //wrapper class object to primitive data type.
    }

}
