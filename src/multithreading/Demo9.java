package multithreading;

public class Demo9 {
    public static void main(String[] args) {
        MyThread9 t=new MyThread9();
        t.start();
      //  t.interrupt();
        System.out.println("End of the main thread");
    }
}
