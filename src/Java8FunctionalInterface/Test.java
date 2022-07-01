package Java8FunctionalInterface;
@FunctionalInterface
 interface Calculator {
    public int calculateSquare(int i);
}
 public class Test{
     public static void main(String[] args) {
         Calculator cal=m -> m*m;
         int n=cal.calculateSquare(5);
         System.out.println("square of number is "+n);
     }
}