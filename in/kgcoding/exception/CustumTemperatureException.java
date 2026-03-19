package in.kgcoding.exception;

public class CustumTemperatureException extends Exception {//extend Exception for checked exception or Runtime Exception for unchecked exception.

    private double degrees;

    public CustumTemperatureException(double degrees){
        this.degrees=degrees;
    }

    @Override
    public String getMessage() {
        return "The Temperature (degrees=" + degrees + ")C isn't in the normal range.";
    }
    public double getDegrees(){
        return degrees;
    }
    public static void main(String[] args) {
        CustumTemperatureException a=new CustumTemperatureException(330);
        System.out.println(a.getMessage());
    }
    
}
 