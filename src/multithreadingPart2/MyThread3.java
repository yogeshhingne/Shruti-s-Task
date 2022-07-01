package multithreadingPart2;

public class MyThread3 extends Thread{

        int total = 0;

        @Override
        public void run() {
            synchronized (this) {
                System.out.println("Child thread start calculation");
                for (int i = 1; i <= 100; i++) {
                    total = total + i;
                }
                System.out.println("Child thread giving notification");
                this.notify();
            }
        }
    }


