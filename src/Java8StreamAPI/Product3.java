package Java8StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product3 {

    private int id;
    private String name;
    private float price;
    public Product3(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        List<Product3> list=new ArrayList<Product3>();
        list.add(new Product3(1,"car",1000000f));
        list.add(new Product3(10,"DJ",5000f));
        list.add(new Product3(5,"Mobile",10000f));
        list.add(new Product3(3,"TV",9000f));
        Float maxElement= list.stream().map(product -> product.price).max((p1,p2)->p1>p2?1:-1).get();
        System.out.println("Maximum price element is "+maxElement);
        Float minElement= list.stream().map(product -> product.price).min((p1,p2)->p1>p2?1:-1).get();
        System.out.println("Minimum price element is "+minElement);
        long count=list.stream().filter(p->p.price>9000f).count();
        System.out.println("count of the element is "+count);
    }
}
