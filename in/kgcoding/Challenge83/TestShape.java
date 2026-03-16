package in.kgcoding.Challenge83;

public class TestShape {

    public static void main(String[] args) {
        Circle circle=new Circle(3);
        Square square=new Square(2);

        System.out.printf("Area of Circle is %f \n",circle.calculateArea());
        System.out.printf("Area of Square is %f \n",square.calculateArea());

    }
}
