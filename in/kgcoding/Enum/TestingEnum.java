package in.kgcoding.Enum;

public class TestingEnum {
    public static void main(String[] args) {
        TrafficLight color=TrafficLight.RED;
        System.out.println(color);
        color=TrafficLight.GREEN;
        System.out.println(color);
        color=TrafficLight.valueOf("RED");//convert String to Enums.
        for (TrafficLight values : TrafficLight.values()) {//Iterate over enums.
            System.out.println(values);
        }
    }

}
