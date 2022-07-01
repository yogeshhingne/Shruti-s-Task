package basicProgram;

public class PalindromeNumber {
    static void isPalindrome(int num){
        int rev=0,rem,n=num;

        while(n!=0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        if(rev==num){
            System.out.println("palindrome number");
        }
        else
        {
            System.out.println("Non Palindrome");
        }
    }
    public static void main(String []args){
        isPalindrome(121);
        isPalindrome(123);
    }
}
