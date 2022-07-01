package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class StringReverseUsingArrayList {
    public static void main(String[] args) {
        String s = "Jayashri";
        char[] ch = s.toCharArray();
        ArrayList list = new ArrayList();
        for (char o : ch
        ) {
            list.add(o);
        }
        Collections.reverse(list);
        ListIterator it= list.listIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }

    }
}
