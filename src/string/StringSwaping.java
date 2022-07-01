package string;

import java.util.Arrays;

public class StringSwaping {
    public static void main(String[] args) {
        {
            String s="yogesh";
            char a1[]=s.toCharArray();
            String s1="hingne";
            char a2[]=s1.toCharArray();
            char temp[]=new char[s1.length()];
            for(int i=0;i<s1.length();i++){
                temp[i]=a1[i];
                a1[i]=a2[i];
                a2[i]=temp[i];
            }
           String  s2= Arrays.toString(a1);
            String s3=Arrays.toString(a2);
            System.out.println(s2);
            System.out.println(s3);
            for(int i=0;i<s1.length();i++) {
                System.out.print(a1[i]);
            }
            System.out.println();
            for(int i=0;i<s1.length();i++) {
                System.out.print(a2[i]);
            }
        }
    }
}
