import java.util.Scanner;
class Book{
static int totalNoOfBooks;
String author;
String title;
String isbn;
boolean isBorrowed;
static{
totalNoOfBooks=0;
}
{
totalNoOfBooks++;
}
Book(String author,String title,String isbn){
this.author=author;
this.title=title;
this.isbn=isbn;
}
Book(String isbn){
this("Unknown","Unknown",isbn);
}
static int getTotalNoOfBooks(){
return totalNoOfBooks;
}
void borrowBook(){
if(isBorrowed){
System.out.println("BOOK IS ALREADY BORROWED...");
}else{
this.isBorrowed=true;
System.out.println("Enjoy the Book...." +this.title);
}
}
void returnBook(){
if(isBorrowed){
this.isBorrowed=false;
System.out.println("Hope You Enjoyed the Book :) ");
}else{
System.out.println("THIS BOOK IS ALREADY  IN THE LIBRARY...");
}
}
public static void main(String[] args){
Book designOfThings=new Book("Ankur","Design Of Things","9839875024");
Book myBook=new Book("2");
System.out.println(Book.getTotalNoOfBooks());
designOfThings.borrowBook();
myBook.borrowBook();
designOfThings.borrowBook();
designOfThings.returnBook();
designOfThings.returnBook();
}
}