package multithreading;

public class MyThread7 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("seeta's thread");
        }
    }
}
