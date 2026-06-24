package in.kgcoding.MultiThreading.threadClass;

import in.kgcoding.MultiThreading.runnable.PrintTask;

public class ThreadPriority {//Priority range from 1(low) to 10(highest)....default is(5)
      public static void main(String[] args) {
        long StartTime=System.currentTimeMillis();
        PrintTask p1=new PrintTask('*');
        PrintTask p2=new PrintTask('@');
        PrintTask p3=new PrintTask('%');

        Thread t1=new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);//10 can also be passed.
        t1.start();
        Thread t2=new Thread(p2);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        Thread t3=new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
 long endTime=System.currentTimeMillis();

        System.out.printf("%s Total time taken  :%d ", 
        Thread.currentThread().getName(),(endTime-StartTime));



    } 
    
}
