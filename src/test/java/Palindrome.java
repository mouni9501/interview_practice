public class Palindrome {
    public static void main(String[] args){
        String str = "amma";
        boolean result = palindrome(str);
        System.out.println("Whether given string is a palindrome or not: "+result);
    }

    public static boolean palindrome(String str){
        int first = 0;
        int last = str.length()-1;
        boolean bool = true;
        while(first<last){
            if(str.charAt(first)!=str.charAt(last)){
                bool = false;
            }
            first++;
            last--;
        }
        return bool;
    }
}
