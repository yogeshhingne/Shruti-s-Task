package string;

public class StringReverseUsingCharArray {
    public static void main(String[] args) {
        String s="Yogesh";
        char s1[]=s.toCharArray();
        char rev[]=new char[s1.length];
        int c=s1.length-1;
        for (int i=0;i<s1.length;i++){
            rev[i]=s1[c];
            c--;
        }
        System.out.println("reverse String is :");
        for(int m=0;m< s1.length;m++) {
            System.out.println(rev[m]);
        }
    }
}
