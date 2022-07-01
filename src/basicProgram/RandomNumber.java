package basicProgram;

public class RandomNumber {
    public static void main(String args[]){
        System.out.println(Math.random());
        int max=9999,min=1111;
       int a= (int)(Math.random() * (max - min + 1) + min);
       System.out.println(a);

    }
}
