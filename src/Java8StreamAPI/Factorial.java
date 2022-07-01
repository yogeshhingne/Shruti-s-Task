package Java8StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Factorial {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        List<Integer> l=list.stream().map(Factorial::fact).collect(Collectors.toList());
        System.out.println(l);
    }
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
