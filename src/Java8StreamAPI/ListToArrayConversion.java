package Java8StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayConversion {
        public static void main(String[] args) {
            List<Integer> l = new ArrayList<Integer>();
            l.add(100);
            l.add(34);
            l.add(78);
            l.add(75);
            Integer []i=l.stream().toArray(Integer[]::new);
            for (Integer m :l) {
                System.out.println(m);
            }
        }
    }




