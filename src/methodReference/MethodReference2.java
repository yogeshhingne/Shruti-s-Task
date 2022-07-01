package methodReference;

public class MethodReference2 {
   public static void threadStatus(){
       System.out.println("Thread is running");
   }

    public static void main(String[] args) {
        Thread thread=new Thread(MethodReference2::threadStatus);
        thread.start();
    }
}
