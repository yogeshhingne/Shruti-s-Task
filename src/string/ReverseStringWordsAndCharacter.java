package string;

public class ReverseStringWordsAndCharacter {
    public static void main(String[] args) {
        String s = "Hello this is the GFG user";
        String words[] = s.split(" ");
        for (int i = 1; i < (words.length) - 1; i++) {
            char ch[] = words[i].toCharArray();
            char ch1[] = new char[ch.length];
            int m = ch.length - 1;
            for (int j = 0; j < ch.length; j++) {
                ch1[j] = ch[m];
                m--;
            }
            words[i] = String.valueOf(ch1);
        }
        String words1[] = new String[words.length];
        int n = words.length - 1;
        for (int i = 0; i < (words.length); i++) {
            words1[i] = words[n];
            n--;
            System.out.println(words1[i]);
        }
    }
}

