package ArraysProgram;

import java.util.Scanner;

public class CopyOneArrayToAnother {
    public static void main(String args[]) {
        int a[] = new int[10], b[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < 5; j++) {
            b[j] = a[j];
        }
        for (int k = 0; k < 5; k++) {
            System.out.println(b[k]);
        }
    }

}
