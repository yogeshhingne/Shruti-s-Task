package ArraysProgram;

import java.util.Arrays;

public class GreatestNumber {
public static void main(String args []){
    int a[]=new int[]{10,20,30,3,22,78,1,0,57};
    int temp;
//    Arrays.sort(a);
//    System.out.println("Greatest number is "+a[a.length-1]);
    for(int i=0;i<a.length-1;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]<a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        System.out.println("Greatest number is "+a[i]);
        break;
    }
}
}

