package Java8StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class IsNumber {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("0", "a", "_", "@", "2", "3");
        List l = list.stream().filter(IsNumber::isNumber).collect(Collectors.toList());
        System.out.println(l);
    }

    public static boolean isNumber(String s) {
        boolean b = false;
        for (int n = 0; n < s.length(); n++) {
            if (s.charAt(n) >= '0' && s.charAt(n) <= '9')
                return b = true;
            else
                return b = false;
        }
        return b;
    }
}
