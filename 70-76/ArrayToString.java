import java.util.*;
class ArrayToString{
public static void main(String[] args){
String[] arr=new String[]{"Hello","I","am","Ankur","Singh"};
StringBuilder sb=new StringBuilder();
for(String str:arr){
sb.append(str).append(" ");
}
System.out.println(sb);
}
}
