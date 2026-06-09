package in.kgcoding.Challenge89;

public class ConcateStrings {
    public static String concateString(String... str){
        StringBuilder sb=new StringBuilder();
        for(String s:str){
            sb.append(s).append(" ");

        }
        return sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(concateString("Ankur","Singh","Cse"));
        System.out.println(concateString("Welcomes", "you..."));
    }
}
