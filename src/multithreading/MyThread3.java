package multithreading;

public class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("Hay I am child thread and my default name is "+Thread.currentThread().getName());
        Thread.currentThread().setName("childTread");
        System.out.println("Hay I am child thread and my customised  name is "+Thread.currentThread().getName());
    }
}
