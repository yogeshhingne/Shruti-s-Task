package string;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class isPalindrome {
    public static void fun(String s){
        char s1[]=s.toCharArray();
        int count=0;
        char rev[]=new char[s1.length];
        int c=s1.length-1;
        for (int i=0;i<s1.length;i++){
            rev[i]=s1[c];
            c--;
        }

       for(int i=0;i<s1.length;i++){
           if(s1[i]==rev[i]){
               count++;
           }

       }
        if(count==s1.length){
            System.out.println("palindrom");
        }
        else{
            System.out.println("Non palindrome");
        }

    }

    public static void main(String[] args) {
        fun("yoy");
    }
}
