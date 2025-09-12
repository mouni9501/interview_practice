public class ReverseANumber {
    public static void main(String[] args){
        int num = 567;
        int rev = reverseANumber(num);
        System.out.println(rev);
    }
    public static int reverseANumber(int num){
        int rev = 0;
        while(num !=0){
            int digit = num % 10;
            rev = rev* 10 +digit;
            num = num/10;
        }
        return rev;
    }
}
