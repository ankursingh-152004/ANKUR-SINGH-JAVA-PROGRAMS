package in.kgcoding.Challenge99;

public class HelloThread extends Thread {
   private final int threadNumber;

   public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.printf("(%d) Hello From Thread- %d\n ",i+1,threadNumber); //if you run t1.run() it will run in main method and doesn't create thread.
        }
    }

}
