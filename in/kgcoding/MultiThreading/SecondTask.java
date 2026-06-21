package in.kgcoding.MultiThreading;

public class SecondTask extends Thread{

     @Override
    public void run() {
        //First task
        for (int i = 1; i <=1000; i++) {
            System.out.print(" Aman ");
            
        }
        System.out.print(" \n Second task completed");
    }

}
