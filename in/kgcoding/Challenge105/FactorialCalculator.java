package in.kgcoding.Challenge105;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }
    @Override
    public Integer call() throws Exception {
        int f=1;
        Thread.sleep(2000);
        if(number<=1){
            return 1;
        }
        for(int i=1;i<=number;i++){
            f*=i;
        }
        return f;
    }


}
