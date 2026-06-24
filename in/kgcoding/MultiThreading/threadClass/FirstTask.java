package in.kgcoding.MultiThreading.threadClass;

public class FirstTask extends Thread{

    @Override
    public void run() {
        //First task
        for (int i = 1; i <=1000; i++) {
            System.out.print(" Ankur ");
            
        }
        System.out.print(" \n First task completed");
    }

}
