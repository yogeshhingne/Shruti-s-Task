package multithreadingPart2;
public class Demo1 {
    public  static void main(String[] args) {
        Display d=new Display();
        MyThread1 t1 = new MyThread1(d, "Dhoni");
        MyThread1 t2=new MyThread1(d,"Yuvraj");
        t1.start();
        t2.start();
    }
}
