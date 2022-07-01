package multithreading;

public class MyThread10 extends Thread {
    Display d;
    String name;

    MyThread10(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}