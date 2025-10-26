class StringManipulate{
public static void main(String[] args)
{
String firstName="Ankur";
String lastName="Singh";
String fullName=firstName+ " " +lastName;
String fullName1=firstName.concat(" ").concat(lastName);
System.out.println("Full Name:"+fullName.toUpperCase());
System.out.printf("Full Name:%s",fullName1);
}
}