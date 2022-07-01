package string;

import java.util.*;

public class RemoveDuplicateWords {
    public static void fun(String str){
        String words[]=str.split(" ");
        //I have used LikedHashSet to preserve insertion order
        Set<String> h=new LinkedHashSet<String>(Arrays.asList(words));
        String s1=h.toString();
        System.out.println(s1);
    }
    public static void main(String[] args) {
String s="Hi I am Yogesh How are You I thik so I am follen in love with You";
fun(s);
    }
}
