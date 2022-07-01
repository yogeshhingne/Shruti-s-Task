package string;

import java.util.Arrays;
import java.util.Locale;

public class AnagramString {
    public static void main(String[] args) {
        int count=0;
        String s1="Yogesh";
        String s2="Hsgeoy";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
            char a1[]=s1.toCharArray();
            char a2[]=s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);

            if(Arrays.equals(a1, a2) == true){
                System.out.println("anagram strings");
            }
            else
                System.out.println("not an anagram Strings");
        }
        else
            System.out.println("not an anagram Strings");
    }
}
