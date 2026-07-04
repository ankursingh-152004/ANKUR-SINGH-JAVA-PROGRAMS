package in.kgcoding.Challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThread {
    public static void main(String[] args) {
        ExecutorService service=Executors.newFixedThreadPool(3);
        for(int i=0;i<10;i++){
            SleepTask t=new SleepTask();
            service.submit(t);
        }

        try {
            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("\n Emergency Shutdown");
                service.shutdown();
            }
        } catch (InterruptedException e) {
           throw new RuntimeException(e);
        }
    }

}
