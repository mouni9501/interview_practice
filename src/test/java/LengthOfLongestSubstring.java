import java.util.HashMap;

public class LengthOfLongestSubstring {
    public static void main(String[] args){
        String s = "abcabcbb";
        int result  =  lengthOfLongestSubstring(s);
        System.out.println(result);
    }
    public static int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
