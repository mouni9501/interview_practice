import java.util.HashMap;
import java.util.Map;
public class MaxNumberOfBalloons {
    public static void main(String[] args){
        String text = "leetcode";
        int minCount = maxNumberOfBalloons(text);
        System.out.println("Minimum number of count: "+minCount);
    }
    public static int maxNumberOfBalloons(String text){
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char[] ch = text.toCharArray();

        // Step 1: build frequency map
        for (char c : ch) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // Step 2: required frequency for "balloon"
        String target = "balloon";
        HashMap<Character,Integer> required = new HashMap<Character,Integer>();
        for(char c:target.toCharArray()){
            required.put(c, required.getOrDefault(c, 0) + 1);
        }

        // Step 3: find min number of times we can form "balloon"
        int minCount = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry: required.entrySet()){
            char key = entry.getKey();
            int needed = entry.getValue();
            int available = hm.getOrDefault(key,0);
            minCount = Math.min(minCount,available/needed);
        }
        return minCount;
    }
}
