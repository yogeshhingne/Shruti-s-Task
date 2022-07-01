package string;

public class NumberOfWordsInGivenString {
    public static void main(String[] args) {
        String s="I am Yogesh and I am working as a software Associate in verinite";
        String words[]=s.split(" ");
        System.out.println("number of words in given String are :"+words.length);
    }
}
