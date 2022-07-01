package basicProgram;

public class PrimeNumber {
    static void fun(int n) {
        int flag=0;
        int m=n/2;
        if (n == 0 || n == 1) {
            System.out.println(n + "is not a prime number");
        }
        else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+"is not prime number");
                    flag=1;
                    break;
                }
                else {
                    if(flag==0)
                    System.out.println(n + "is prime");
                    break;

                }
            }
        }
    }
    public static void main(String args[]){
       // fun(12);
        fun(17);
        fun(5);
        fun(0);

    }
}
