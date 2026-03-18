package in.kgcoding.Challenge86;

public class Car extends Vehicle{

    @Override
    public void Service() {
        super.Service();
        System.out.println("Car Servicing...");
    }

    public static void main(String[] args) {
        Car car=new Car();
        Vehicle vehicle=new Vehicle();
        car.Service();
        vehicle.Service();
        
    }
}
