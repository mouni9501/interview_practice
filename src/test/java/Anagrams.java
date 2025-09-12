import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args){
        String s1 = "mother-in-law";
        String s2 = "hitler women";
        boolean bool = isAnagram(s1,s2);
        System.out.println(bool);
    }
    public static boolean isAnagram(String s1,String s2){
        Map<Character,Integer> freq = new HashMap<>();
        String st1 = s1.replaceAll("[^a-zA-Z]","").toLowerCase();
        String st2 = s1.replaceAll("[^a-zA-Z]","").toLowerCase();

        if(st1.length()!=st2.length()){
            System.out.println("Given strings are not anagrams");
            return false;
        }

        for(char c:s1.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for(char c:s2.toCharArray()){
            int count  = freq.getOrDefault(c,0);
            if(count == 0)
                return false;
            freq.put(c,count-1);
        }
        System.out.println("Given strings are anagrams");
        return true;

    }
}
