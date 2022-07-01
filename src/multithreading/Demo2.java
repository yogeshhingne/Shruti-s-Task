package multithreading;

public class Demo2 {
    public static void main(String[] args) {
        MyRunnable2 r=new MyRunnable2();
        Thread t1=new Thread();
        Thread t2=new Thread(r);
        t1.start();
        System.out.println("main thread");
    }
}
