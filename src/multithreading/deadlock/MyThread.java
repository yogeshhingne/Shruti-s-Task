package multithreading.deadlock;

public class MyThread extends Thread{
    A a=new A();
    B b=new B();
     public  void m(){
         this.start();
         a.d1(b);

     }
    @Override
    public void run() {
        b.d2(a);
    }

    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.m();
    }
}
