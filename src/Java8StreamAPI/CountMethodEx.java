package Java8StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class CountMethodEx {

        public static void main(String[] args) {
            List<Integer> l=new ArrayList<Integer>();
            l.add(100);
            l.add(34);
            l.add(78);
            l.add(75);
             long n=l.stream().filter(i->i<35).count();
            System.out.println(n);

        }
    }

