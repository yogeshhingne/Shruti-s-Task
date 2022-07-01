package multithreading;

public class Demo7 {
    public static void main(String[] args) throws InterruptedException {
        MyThread7 t = new MyThread7();
        t.start();
        t.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("Rama's thread");
        }
    }
}