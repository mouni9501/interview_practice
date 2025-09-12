import java.util.ArrayList;
import java.util.HashMap;

public class FindAnagrams {
    public static void main(String[] args){
        String s = "aaaaaaaaaaaaaaaaaaaa";
        String p ="a";
        ArrayList<Integer> indicies = findAnagrams(s,p);
        System.out.println(indicies);
    }
    public static ArrayList<Integer> findAnagrams(String s,String p){
        ArrayList<Integer> indicies = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String subString = s.substring(i,j);
                boolean bool = isAnagram(subString,p);
                if(bool){
                    indicies.add(i);
                }
            }
        }
        return indicies;
    }

    public static boolean isAnagram(String subString,String p){
        HashMap<Character,Integer> freq = new HashMap<>();
        if(subString.length()!=p.length()){
            return false;
        }
        for(char c:subString.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for (char c:p.toCharArray()){
            int count = freq.getOrDefault(c,0);
            if(count==0)
                return false;
            freq.put(c,count-1);
        }
        return true;
    }
}
