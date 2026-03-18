package in.kgcoding.polymorphism;

public class Overriding extends Vehicle{

//METHOD OVERRIDING 
//same name,return type,and parameter in child and parent class 

    class Dog{
        public void bark(){
            System.out.println("woof...");
        }
    }
 
    class Hound extends Dog{ 

        public void sniff(){
            System.out.println("sniff");
        }
        public void bark(){
            System.out.println("bowl");
        }
    }






    // @Override
    // public void start() {
    //     super.start();//  it is used to call parent method.
    //     System.out.println("Overriding Is Starting...");
    // }
}
