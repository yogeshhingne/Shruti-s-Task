package string;

public class IsLetterOnly {
    private static boolean isNumeric(final CharSequence cs) {
        final int sz = cs.length();
        for (int i = 0; i < sz; i++) {
            if (!Character.isLetter(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumeric("dhjhgfhudfabc"));

    }
}