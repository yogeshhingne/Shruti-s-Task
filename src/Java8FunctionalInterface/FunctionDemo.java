package Java8FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> ref=str->str.length();
        Integer length = ref.apply("Yogesh");
        System.out.println(length);
    }
}
