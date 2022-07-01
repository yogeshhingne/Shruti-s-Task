package ArraysProgram;

public class ArraySorting {
    public static void main(String args[]){
        int a[]=new int[]{1,2,0,3,2,3,9,8,4};
        int temp=a[0];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++) {
            System.out.print(" " + a[i]);
        }
    }

}
