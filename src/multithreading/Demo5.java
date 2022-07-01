package multithreading;

public class Demo5 {
    public static void main(String[] args) {
        MyThread5 t=new MyThread5();
        t.setPriority(10);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread");
        }
    }
}
