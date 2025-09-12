import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LongestPalindromeSubString {
    public static void main(String[] args){
        String s = "cbbd";
        String result = longestPalindromeSubString(s);
        System.out.println("Longest Palindrome SubString is: " +result);
    }

    public static String longestPalindromeSubString(String s){
        if(s==null|| s.isEmpty())
            return " ";

        String longest = " ";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                if(palindromeOrNot(sub) && sub.length()>longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static boolean palindromeOrNot(String sub){
        int left = 0;
        int right = sub.length()-1;
        while(left<right){
            if(sub.charAt(left)!=sub.charAt(right)){
                return false;
            }
            left++;
            right --;
        }
        return true;
    }


    /*
    public static String longestPalindromeSubString(String s){
        String sb = "";
        String palindrome = " ";
        for(int i=0;i<s.length();i++){
            for(int j=1;j<=s.length()-1;j++){
                if(j >i ) {
                    sb = s.substring(i,j);
                  sb =  palindromeOrNot(sb);
                }
            }
        }
        return sb;
    }
    public static String palindromeOrNot(String sb){
    StringBuilder stb = new StringBuilder();
    String longest = " ";
    ArrayList<String> al = new ArrayList<>();
    if(sb.length()>1){
        for(int i=sb.length()-1;i>=0;i--){
            stb = stb.append(sb.charAt(i));
        }
        if(sb.equalsIgnoreCase(stb.toString())){
            System.out.println("Given String is palindrome: "+sb);
            int length = sb.length();
            al.add(sb);
            longest = Collections.max(al, Comparator.comparingInt(String::length));
            //System.out.println("Longest: " + longest);
        }
    }
    return longest;
    }*/
}
