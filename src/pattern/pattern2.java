package pattern;

public class pattern2 {
    public static void main(String a[]) {
        for (int i = 0; i <= 10; i++) {
            int flag=0;
            for (int j = 0; j <= 10; j++) {
                if (j >= (5 - i) && j <= (5 + i)&& i<=5) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}