class Student_toString{
String name;
int age;
String rollNumber;
String house;
public Student_toString(String name,int age,String rollNumber,String house)
{
this.name=name;
this.age=age;
this.rollNumber=rollNumber;
this.house=house;
}
@Override
public String toString(){
return "Student Details:{name:"+ name +",age:"+ age +",rollNumber:"+ rollNumber +",house:"+ house +" }";
}
public static void main(String[] args){
Student_toString stu=new Student_toString("ankur",21,"2300560100042","Charity");
System.out.println(stu);
}
}