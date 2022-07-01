package multithreading;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread3 t=new MyThread3();
        t.start();
        Thread.currentThread().setName("Ram");
        System.out.println("Hay I am main thread but you have changed my name and my latest name is "+Thread.currentThread().getName());
    }
}
