public class NumberIsAPalindrome {
    public static void main(String[] args){
        int n=121;
        numberIsAPalindrome(n);

    }
    public static void numberIsAPalindrome(int n){
        int givenNumber = n;
        int rev = 0;
        while(n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        System.out.println(rev);
        if(givenNumber==rev){
            System.out.println("given num is a palindrome");
        }else{
            System.out.println("given num is not a palindrome");
        }
    }
}
