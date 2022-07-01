package Java8StreamAPI;

import java.util.Arrays;
import java.util.List;

public class isEmptyElement {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("abc","","xyz","","gayu");
        long count=list.stream().filter(x -> x.isEmpty())
                .count();
        System.out.println(count);
    }
}
