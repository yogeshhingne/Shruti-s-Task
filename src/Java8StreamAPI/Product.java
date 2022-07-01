package Java8StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private int id;
    private String name;
    private float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();
        list.add(new Product(1,"car",1000000f));
        list.add(new Product(10,"DJ",5000f));
        list.add(new Product(5,"Mobile",10000f));
        list.add(new Product(3,"TV",9000f));
       List<Float> list1= list.stream().filter(p->p.price>9000f).map(product -> product.price).collect(Collectors.toList());
        System.out.println(list1);
    }
}
