package in.kgcoding.ExecutorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import in.kgcoding.MultiThreading.runnable.PrintTask;

public class TestingMultipleThreadExecutor {
    //For multiple Thread use - Executors.newFixedThreadPool(3); 3 thread pool.
       
     public static void main(String[] args) throws InterruptedException {
        ExecutorService services=Executors.newFixedThreadPool(3);
        for(int i=0;i<10;i++){
            PrintTask t1=new PrintTask((char)i);
            services.submit(t1);
        }        


        services.shutdown();
        if(!services.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("\n**************************");
            services.shutdown();

        }
    }


}
