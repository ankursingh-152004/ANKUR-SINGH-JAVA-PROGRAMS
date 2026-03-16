package in.kgcoding.Challenge83;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    

}
