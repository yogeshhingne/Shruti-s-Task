package string;

public class OccuranceOfCharacterInString {
    public static int occuranceOfCharacterInString(String str,char ch){
        int count=0;
        char array[]=str.toCharArray();
      for(int i=0;i<array.length;i++){
          if(array[i]==ch){
              count++;
          }
      }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(occuranceOfCharacterInString("yogeshhingne",'j'));

    }
}
