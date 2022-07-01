package Java8StreamAPI;

import java.util.ArrayList;
import java.util.List;


public class printElementUsingStreammethod {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(100);
        l.add(34);
        l.add(78);
        l.add(75);
       l.stream().forEach(System.out::println);
       l.stream().forEach(i->{System.out.println(i*i);});
    }
}


