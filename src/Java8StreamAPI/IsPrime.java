package Java8StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsPrime {
    static List<Integer> list = Arrays.asList(1, 2, 3, 13, 20, 10, 17);

    public static void main(String[] args) {
        int m = 2;

        List<Integer> l = list.stream().filter(IsPrime::isPrime).collect(Collectors.toList());
        System.out.println(l);
    }

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;

                } else return true;
            }
        }
        return true;
    }
}
