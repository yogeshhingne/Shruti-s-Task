package Java8StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sortedMethodEx {


    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(100);
        l.add(34);
        l.add(78);
        l.add(75);
        List<Integer> list = l.stream().sorted().collect(Collectors.toList());
        System.out.println(list);

    }
}
