package string;

public class SpecialCharacterCount {
    public static void main(String[] args) {
        String s = "fd%$$^&&mdgn?";
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)) && !Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        if(count==0)
            System.out.println("Special character not found");
        else
            System.out.println("special character count is"+count);
    }
}
