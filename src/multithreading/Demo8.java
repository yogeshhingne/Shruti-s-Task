package multithreading;

public class Demo8 {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<5;i++){
            System.out.println("Slide- "+i);
            Thread.sleep(5000);
        }
    }
}