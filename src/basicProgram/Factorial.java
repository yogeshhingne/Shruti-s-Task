package basicProgram;

public class Factorial {
    static int fact(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
       return fact;
    }
    public static void main(String args[]){
        fact(5);
        System.out.println("factorial is "+fact(5));
    }
}
