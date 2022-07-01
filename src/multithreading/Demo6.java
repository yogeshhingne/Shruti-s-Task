package multithreading;

public class Demo6 {
    public static void main(String[] args) {
        MyThread6 t=new MyThread6();
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("Main thread");
        }
    }
}
