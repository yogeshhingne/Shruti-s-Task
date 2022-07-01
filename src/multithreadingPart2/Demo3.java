package multithreadingPart2;

public class Demo3 {
        public static void main(String[] args) throws InterruptedException {
            MyThread3 t=new MyThread3();
            t.start();
            t.sleep(1000);
            synchronized (t){
                System.out.println("Main Thread calling wait notification");
               // t.wait();
                 t.wait(3000);
                System.out.println("Main thread got notification");
                System.out.println(t.total);

            }
        }
    }

