package multithreading.deadlock;

public class B {
     public synchronized void d2(A a){
        System.out.println("d2() start");
        try {
            Thread.sleep(50);
        }catch (InterruptedException e){}
         System.out.println("thread2 trying to call A's last() method");
        a.last();
    }
    public synchronized  void last(){
        System.out.println("Inside B's last method");
    }
}
