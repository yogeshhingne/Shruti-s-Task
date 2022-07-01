package ArraysProgram;

import java.sql.Array;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String args []){
        int a[]=new int[]{10,20,30,10,80,80,50};
        Arrays.sort(a);
        int temp []=new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }
        temp[j++]=a[a.length-1];
        for(int i=0;i<j;i++){
            a[i]=temp[i];
        }
        for(int i=0;i<j;i++){
         System.out.println(a[i]);
        }
    }

}
