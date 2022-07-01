package multithreadingPart2;
public class MyThread1 extends Thread{
        Display d;
        String name;

        MyThread1(Display d, String name) {
            this.d = d;
            this.name = name;
        }

        @Override
        public void run() {
            d.wish(name);
        }
    }

