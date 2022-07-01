package string;

public class PalindromicSubString {
    public static void main(String[] args) {
        String s = "MALAYALAM";
        int count=0;

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String subString=s.substring(i,j+1);
                if(checkSubString(subString)){
                    count++;
                }
            }

        }
        System.out.println("Number of  palindomic substrings are :"+count);
    }

    private static boolean checkSubString(String sb) {
        int size=sb.length();
        for (int i = 0; i < sb.length();i++) {
            if (sb.charAt(i)!=sb.charAt(size-i-1)){
                return false;
            }
        }
        return true;
    }
    }

