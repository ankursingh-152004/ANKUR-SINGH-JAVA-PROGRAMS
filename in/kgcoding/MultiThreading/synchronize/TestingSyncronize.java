package in.kgcoding.MultiThreading.synchronize;

public class TestingSyncronize {
    public static void main(String[] args) {
        long StartTime=System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted" + e.getMessage());
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("Final counter value: %d and "+"Time Taken: %d ",counter.getCount(),(endTime-StartTime));
    }
}
