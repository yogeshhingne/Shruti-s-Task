package Java8StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class MinANdMaxValues {

        public static void main(String[] args) {
            List<Integer> l = new ArrayList<Integer>();
            l.add(100);
            l.add(34);
            l.add(78);
            l.add(75);
           Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
           Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
            System.out.println("minimum value is "+min);
            System.out.println("Maximum value is "+max);
        }
    }
