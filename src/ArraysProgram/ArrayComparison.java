package ArraysProgram;

public class ArrayComparison {
    public static void main(String args[]) {
        int a[]=new int[]{10,1,2,3,2,5,0};
        int b[]=new int[]{10,1,2,3,2,5,0};
        int c=0;
        if(a.length!=b.length){
            System.out.println("Arrays are not equal");
        }
        else {
            for(int i=0;i<a.length;i++){
                if(a[i]==b[i]){
                    c++;
                }

            }
            if(c==a.length){
                System.out.println("Arrays are equal");
            }
            else {
                System.out.println("Arrays are not equal");
            }
        }
    }
}
