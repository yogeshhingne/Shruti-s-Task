package multithreading;

public class ChildThreadWaitingUntilMainThread extends Thread{
    static Thread mt;
    public void run(){
        try{
            mt.join();
        }catch(InterruptedException e){}
        for(int i=0;i<5;i++){
            System.out.println("Child thread");
        }
    }
}

