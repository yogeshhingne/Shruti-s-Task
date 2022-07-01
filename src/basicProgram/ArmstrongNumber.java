package basicProgram;

public class ArmstrongNumber {
    static void fun(int num) {

        int length = 0, sum = 0, n = num, m = num, rem;
        while (n != 0) {
            length++;
            n = n / 10;
        }
        while (m != 0) {
            rem = m % 10;
            sum += (Math.pow(rem,length));
            m = m / 10;
        }
        if (sum == num) {
            System.out.println("number is armstrong");
        } else
            System.out.println("number is Not armstrong");

    }

    public static void main(String[] a) {
        fun(153);
        fun(1443);
    }
}
