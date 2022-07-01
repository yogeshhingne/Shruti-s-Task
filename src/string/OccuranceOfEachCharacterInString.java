package string;

import java.util.Arrays;

public class OccuranceOfEachCharacterInString {
    public static void fun(String str){
        char []a=str.toCharArray();
        char temp;
        Arrays.sort(a);
        int count=1;
        for(int i=1;i<a.length;i++){
            if(a[i-1]==a[i]){
                count++;
            }
            else{
                System.out.println(a[i-1]+"->"+count);
                count=1;
            }
        }
        if(a[a.length-2]==a[a.length-1]){
            System.out.println(a[a.length-1]+"->"+count);
        }else
        {
            System.out.println(a[a.length-1]+"->1");
        }
    }

    public static void main(String[] args) {
        fun("yogeshhingne");
    }
}
