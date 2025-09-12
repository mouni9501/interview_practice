public class ReverseOnlyLetters {
    public static void main(String[] args){
        String s = "ab-cd";
        String afterReversing = reverseOnlyLetters(s);
        System.out.println("After reversing the string: "+afterReversing);
    }

    public static String reverseOnlyLetters(String s){
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            // move left until we find a letter
            while(left < right && !isLetter(ch[left])){
                left++;
            }
            // move right until we find a letter
            while(left<right && !isLetter(ch[right])){
                right--;
            }
            //swapping the letters
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static  boolean isLetter(char c){
        if((c>='A' && c<='Z') || (c>='a' && c<='z') ){
            return true;
        }
        return false;
    }

}
