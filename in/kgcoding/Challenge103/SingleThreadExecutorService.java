package in.kgcoding.Challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorService {
    public static void main(String[] args) {
         
       try (ExecutorService service = Executors.newSingleThreadExecutor()){
        PrintNumbers t=new PrintNumbers();
        service.submit(t);
       } catch (Exception e) {
      
       }
    }

}
