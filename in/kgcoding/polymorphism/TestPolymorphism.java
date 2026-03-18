package in.kgcoding.polymorphism;

public class TestPolymorphism {

    public static void main(String[] args) {
        Car c =new Car();
        Vehicle v=new Vehicle();

        carTest(v);
        carTest(c);
        // REFERENCES AND OBJECTS

        // Vehicle vCar=new Car();  //UPCASTING
        // Car cVehicle= (Car) new Vehicle();   //DownCASTing

        // Object ref=new Object();
    }

        private static void carTest(Vehicle veh){

            // if we pass the Car object then we have Downcast it it first
            // Car eVehicle=(Car) veh;

            // eVehicle.noOfDoors();
              
            veh.start();
        }
    }

