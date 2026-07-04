package in.kgcoding.Challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

public class TestingFactorial {
    public static void main(String[] args) {
        try (ExecutorService service=Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list=new ArrayList<>();
            for(int i=0;i<10;i++){
                FactorialCalculator t=new FactorialCalculator(i);
                list.add(service.submit(t));
            }
            for(Future<Integer> future :list){
            System.out.printf("\nResult is :%d",future.get());
           }

           if(service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("Your Time Ends Now...");
            service.shutdown();
           }
        }catch(InterruptedException | ExecutionException e){
            throw new RuntimeException(e);
        }
    }

}
