package multithreading;

public class MyExa extends  Thread{
    public void run() {
        myMethod();
    }
    synchronized static  void myMethod(){
        for (int i = 0; i <5; i++) {
            System.out.println("MyExa Thread");
        }
    }
}
