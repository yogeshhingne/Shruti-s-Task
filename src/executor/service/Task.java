package executor.service;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Name :"+Thread.currentThread().getName());
    }
}
