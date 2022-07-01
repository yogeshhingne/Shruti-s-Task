package multithreading.deadlock;

public class A {
    public synchronized void d1(B b){
        System.out.println("d1() start");
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e){}
        System.out.println("Thread1 trying to call B's last() method");
        b.last();
    }
    public  void last(){
        System.out.println("Inside A's last method");
    }
}
