package multithreading;

public class Demo10 {
    public synchronized static void main(String[] args) {
        Display d=new Display();

        MyThread10 t1 = new MyThread10(d, "Dhoni");
        MyThread10 t2=new MyThread10(d,"Yuvraj");
        t1.start();
        t2.start();


    }
}
