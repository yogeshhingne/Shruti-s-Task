package multithreading;

public class Demo11  {
    public static void main(String[] args) throws InterruptedException {
        MyThread11 t=new MyThread11();
        t.start();
        t.sleep(1000);
        synchronized (t){
            System.out.println("Main Thread calling wait notification");
            t.wait();
           // t.wait(3000);
            System.out.println("Main thread got notification");
            System.out.println(t.total);

        }
    }
}
