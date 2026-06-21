package in.kgcoding.MultiThreading;

public class ThirdTask extends Thread{

     @Override
    public void run() {
        //First task
        for (int i = 1; i <=1000; i++) {
            System.out.print(" Priyanshu ");
            
        }
        System.out.print(" \n Third task completed");
    }

}
