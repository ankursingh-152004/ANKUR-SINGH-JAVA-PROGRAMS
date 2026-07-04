package in.kgcoding.ExecutorServices.Future;

import java.util.concurrent.Callable;

public class FetchNames implements Callable<String>{

    private final String name;

    public FetchNames(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(4000);
        return name + " , How Are You!...";
    }

}
