package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WhyCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> obj=new CompletableFuture<>();
        obj.get();
        //here we can manually complete execution of the program
        obj.complete("if it is taking more time to get the result then complte execution forcefully");

    }

}
