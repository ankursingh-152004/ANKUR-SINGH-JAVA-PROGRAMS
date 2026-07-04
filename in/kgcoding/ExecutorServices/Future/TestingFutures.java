package in.kgcoding.ExecutorServices.Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service=Executors.newFixedThreadPool(3);
        FetchNames t1=new FetchNames("Ankur");
        FetchNames t2=new FetchNames("Rahul");
        FetchNames t3=new FetchNames("Abhay");
        FetchNames t4=new FetchNames("Priyanshu");
        FetchNames t5=new FetchNames("Aman");

        Future<String> name1=service.submit(t1);
        Future<String> name2=service.submit(t2);
        Future<String> name3=service.submit(t3);
        Future<String> name4=service.submit(t4);
        Future<String> name5=service.submit(t5);

        System.out.printf("\nHello %s ",name1.get());
        System.out.printf("\nHello %s ",name2.get());
        System.out.printf("\nHello %s ",name3.get());
        System.out.printf("\nHello %s ",name4.get());
        System.out.printf("\nHello %s ",name5.get());

        service.shutdown();
    }

}
