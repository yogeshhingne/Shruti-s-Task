package multithreading;

public class JoinMethodDemo {
    public static void main(String[] args) {
        ChildThreadWaitingUntilMainThread.mt=Thread.currentThread();
        ChildThreadWaitingUntilMainThread t=new ChildThreadWaitingUntilMainThread();
        t.start();
        
        for(int i=0;i<5;i++){
            System.out.println("main Thread");
        }
    }
}
