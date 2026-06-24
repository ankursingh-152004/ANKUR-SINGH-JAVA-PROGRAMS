package in.kgcoding.MultiThreading.threadClass;

public class NeedOfMultiThreadng {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        //First task
        for (int i = 1; i <=1000; i++) {
            System.out.print(" Ankur ");
            
        }
        System.out.print(" \n First task completed");
        //Second task
        for (int i = 1; i <=1000; i++) {
            System.out.print(" Aman ");
            
        }
        System.out.println("\n Second task completed");

        //Third task
        for (int i = 1; i <=1000; i++) {
            System.out.print(" Priyanshu ");
            
        }
        System.out.println("\n Third task completed");

        long endTime=System.currentTimeMillis();

        System.out.printf("Total time taken  :%d ", (endTime-startTime));


    }

}
