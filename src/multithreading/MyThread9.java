package multithreading;

public class MyThread9 extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0;i<5;i++){
                System.out.println("I am lazy thread");
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println("I got InterruptedException");
        }
    }
}
