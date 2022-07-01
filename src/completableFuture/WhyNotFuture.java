package completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class WhyNotFuture {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(10);
        Future<List<Integer>> list= service.submit(()->{
            delay(1);
            //here as we provided delay odf 1 min so there program will be stuck for 1 min and we can not complete this program manually
            return Arrays.asList(1,2,3,4);

        });
    }
private static void delay(int min){
    try {
        TimeUnit.MINUTES.sleep(min);
    }catch (InterruptedException e){
        e.printStackTrace();
    }
}
}