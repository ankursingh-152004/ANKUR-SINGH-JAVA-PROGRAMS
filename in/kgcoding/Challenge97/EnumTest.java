package in.kgcoding.Challenge97;

public class EnumTest {
    public static void main(String[] args) {
     for (Day values : Day.values()) {
        System.out.printf("%s : %s \n",values,values.getType());
     }
    }

}
