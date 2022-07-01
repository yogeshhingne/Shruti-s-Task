package Java8FunctionalInterface;

import java.util.function.Predicate;

public class IsGraterThanTenANdEven {
    public static void main(String[] args) {
        int x[]={5,10,15,20,25,40,50};
        Predicate<Integer> p1=i1->i1>10;
        Predicate<Integer> p2=i2->i2%2==0;
        for (Integer i:x){
            if(p1.and(p2).test(i)){
                System.out.println(i);
            }
        }


    }
}
