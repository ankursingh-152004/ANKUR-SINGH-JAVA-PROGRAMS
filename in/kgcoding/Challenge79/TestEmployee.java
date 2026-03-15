package in.kgcoding.Challenge79;

public class TestEmployee {

    public static void main(String[] args) {
        
        Employee emp=new Employee("Ankur", 21, 100000);
        System.out.println(emp.employeeDetail());
        emp.setName("Rahul");
        System.out.println(emp.employeeDetail());
    }
}
