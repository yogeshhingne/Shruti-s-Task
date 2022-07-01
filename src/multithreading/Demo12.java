package multithreading;
class MultithreadingDemo extends Thread {
    static Thread mt;
    public void run() {

        synchronized (mt) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Object Thread------" + Thread.currentThread().getId() + "-------is running.");
            }
        }
    }
}
class Multi implements Runnable {
    static Thread mt1;
    public void run() {
        synchronized (mt1) {
            for(int i=0;i<3;i++) {
                        System.out.println("Object1 Thread------" + Thread.currentThread().getId() + "-------is running.");
                    }
        }

    }
}
public class Demo12 {
    public static void main(String[] args) {
        int n = 3; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo.mt=Thread.currentThread();
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
            Multi.mt1=Thread.currentThread();
          Multi obj=  new Multi();
            Thread object1 = new Thread(obj);
            object1.start();
        }
    }
}

