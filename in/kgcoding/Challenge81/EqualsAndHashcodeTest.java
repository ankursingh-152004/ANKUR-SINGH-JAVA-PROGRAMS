package in.kgcoding.Challenge81;

public class EqualsAndHashcodeTest {

    public static void main(String[] args) {
        
    
    Person person1 =new Person("Ankur", 21, "42");
    Person person2 =new Person("Ankur", 21, "42");

    if(person1==person2){
        System.out.println("Equals");
    }else{
        System.out.println("Not Equals");
    }
}
}
