package pattern;

public class DimondPattern {

    public static void main(String[] args) {
        int m = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j >= 6 - m && j <= 4 + m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if (i < 5)
                m++;
            else
                m--;
            System.out.println();
        }
    }
}


