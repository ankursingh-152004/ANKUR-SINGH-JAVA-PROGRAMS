package in.kgcoding.Challenge110;

public class TestingFunctionalInterface {
    public static void main(String[] args) {
        Result res=num->{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        };
System.out.println(res.isCandidate(5));        
    }
}
