package multithreading;

public class MyThread6 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Child thread");
        }
        Thread.yield();
    }
}
