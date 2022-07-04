package Java8StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertToSet {
    public static void main(String[] args) {
        List<Product1> productsList = new ArrayList<Product1>();
        //Adding Products
        productsList.add(new Product1(1,"HP Laptop",25000f));
        productsList.add(new Product1(2,"Dell Laptop",30000f));
        productsList.add(new Product1(3,"Lenevo Laptop",28000f));
        productsList.add(new Product1(4,"Sony Laptop",28000f));
        productsList.add(new Product1(5,"Apple Laptop",90000f));
        Set<Float> set=productsList.stream().map(p->p.price).collect(Collectors.toSet());
        System.out.println(set);
        Map<Integer,String> map=productsList.stream().collect(Collectors.toMap(p->p.id,p->p.name));
        System.out.println(map);

    }
}
