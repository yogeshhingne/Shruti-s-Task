package multithreading;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("My default priority is "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("My customized priority is "+Thread.currentThread().getPriority());
    }
}
