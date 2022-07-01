package string;

public class countVovelsAndConsonants {

        public static void main(String[] args) {
            String s="java guides 47&dja??/,,.*7& java java java";
            s=s.toLowerCase();
            int count1=0,count2=0;
            for(int i=0;i<s.length();i++) {
                if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    count1++;
                }
                else if(s.charAt(i)>='a' && s.charAt(i)<='z')
                    count2++;
            }
            System.out.println("Number of vowels = "+count1+" and "+"number of consonants = "+count2);
        }
    }

