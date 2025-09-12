public class FirstPalindrome {
    public static void main(String[] args){
        String[] words = {"notapalindrome","racecar"};
        String word = firstPalindrome(words);
        System.out.println("First palindrome word is: "+word);
    }
    public static String firstPalindrome(String[] words){
        String firstPalindrome = "";
        boolean bool;
        for(String word:words){
          bool = palindromeCheck(word);
            if(bool){
                firstPalindrome = word;
                break;
            }
        }
        return firstPalindrome;

    }

    public static boolean palindromeCheck(String word){
        int left = 0;
        int right = word.length()-1;
        boolean bool = true;
        while(left<right){
            if (word.charAt(left) != word.charAt(right)) {
                bool = false;
                break;
            }
            left++;
            right--;
        }
        return bool;
    }
}
