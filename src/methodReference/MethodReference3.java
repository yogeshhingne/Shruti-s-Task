package methodReference;

import java.util.function.BiFunction;

public class MethodReference3 {
    public static int  add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> ref=MethodReference3::add;
        ref.apply(10,20);
        System.out.println(ref.apply(10,20));
    }
}
