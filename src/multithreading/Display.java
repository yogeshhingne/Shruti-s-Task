package multithreading;

public class Display {
    public  void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Good Morning :");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
    }
}

