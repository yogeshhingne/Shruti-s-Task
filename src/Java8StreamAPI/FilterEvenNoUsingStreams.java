package Java8StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNoUsingStreams {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        l.add(18);
        l.add(15);
        List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l1);

    }
}
