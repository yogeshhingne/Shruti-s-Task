package Java8FunctionalInterface;

import java.util.function.Predicate;

public class IsLengthGreaterTahnFive {
    public static void main(String[] args) {
        Predicate<Integer> ref=(e)->e>5;
        String s="Yoge";
        System.out.println( ref.test(s.length()));
    }
}
