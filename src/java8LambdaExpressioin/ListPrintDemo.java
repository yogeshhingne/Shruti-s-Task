package java8LambdaExpressioin;

import java.util.ArrayList;
import java.util.List;

public class ListPrintDemo {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("yogesh");
        list.add("shankar");
        list.add("hingne");
        list.forEach(o -> System.out.println(o));

    }
}
