public class IsPrefixString {
    public static void main(String[] args){
        String s = "ileetcode";
        String[] words = {"i","love","leetcode","apples"};
        boolean bool = isPrefixString(s,words);
        System.out.println(bool);
    }
    public static boolean isPrefixString(String s,String[] words){
        boolean bool = true;
        String firstWord = words[0];
        StringBuilder sb = new StringBuilder();
        if(s.charAt(0) != firstWord.charAt(0))
            return false;
        if(s.length()<firstWord.length())
            return false;
        for(String word:words){
            sb.append(word);
            int length = sb.length();
            String subString = s.substring(0,length);
            if(length == s.length())
               return bool;
            if(!sb.toString().equals(subString) ){
                return false;
            }
        }
        return bool;
    }
}
