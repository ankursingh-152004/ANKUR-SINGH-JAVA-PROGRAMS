package in.kgcoding.varArguments;

public class VarArgs {  // accept any number of arguments and it is declared as allipsis(...)
    public static void main(String[] args) {
        System.out.println(sum(2,4,3,5,3));
    }
    public static int sum(int f,int s,int... a){
        int sum=f+s;
        for (int i : a) {
            sum+=i;
             
        }
        return sum;
    }

}
