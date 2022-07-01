package multithreading;

public class Demo1 {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        MyExa t2 = new MyExa();
        t2.start();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
