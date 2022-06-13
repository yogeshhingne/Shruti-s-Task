package student.demo.pro.parcticePro.exceptionhandlingprograms;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int i=1,j=0,k;
        if(j!=0) {
            k = i / j;
            System.out.println(k);
        }
        else{
            System.out.println("we can not divide number by zero");
        }

    }
    }

