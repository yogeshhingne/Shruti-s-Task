package string;

public class StringReverseUsingStringBuffer {
    public static void main(String[] args) {
        String s="Yogesh";
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        sb.toString();
        System.out.println(sb);
    }
}
