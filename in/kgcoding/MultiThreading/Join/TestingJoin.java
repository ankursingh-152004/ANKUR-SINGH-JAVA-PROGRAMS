package in.kgcoding.MultiThreading.Join;

import in.kgcoding.MultiThreading.runnable.PrintTask;

public class TestingJoin {//One thread cannot start executing its task until another thread finish its task. 
    //Helps in Syncronizing multiple threads
      public static void main(String[] args) throws InterruptedException {
        long StartTime=System.currentTimeMillis();
        PrintTask p1=new PrintTask('*');
        PrintTask p2=new PrintTask('@');
        PrintTask p3=new PrintTask('%');

        Thread t1=new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        System.out.println("First Done");
        Thread t2=new Thread(p2);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        System.out.println("second Done");
        t1.join(); //join(long millis) Or join(long  millies,int nanos)---->wait for only this time.
        Thread t3=new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        System.out.println("third Task");
 long endTime=System.currentTimeMillis();

        System.out.printf("%s Total time taken  :%d ", 
        Thread.currentThread().getName(),(endTime-StartTime));



    } 
    
}
