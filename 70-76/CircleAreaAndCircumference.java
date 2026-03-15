import java.util.*;
class CircleAreaAndCircumference{
double radiusInMm;

 CircleAreaAndCircumference(double radiusInMm){
this.radiusInMm=radiusInMm;
}

double getCircumference(){
return 2*radiusInMm*Math.PI;
}

double getArea(){
return Math.PI*Math.pow(radiusInMm,2);
}
@Override
public String toString(){
return "Circle props: Radius in mm: "+radiusInMm+",Circumference inn mm: " + getCircumference()+",Area in mm2: "+getArea();
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to world of circle...\n");
System.out.print("Enter the radius: ");
double radius=sc.nextDouble();
 CircleAreaAndCircumference circle=new  CircleAreaAndCircumference(radius);
System.out.println(circle);
}
}
