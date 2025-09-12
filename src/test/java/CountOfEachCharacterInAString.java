import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class CountOfEachCharacterInAString {
    public static void main(String[] args){
        String str = "bharathi";
        LinkedHashMap<Character,Integer> hm = countOfEachCharacterInAString(str);
        for(Map.Entry<Character,Integer> eachPair:hm.entrySet()){
            System.out.println(eachPair.getKey()+" "+eachPair.getValue());
        }
    }

    public static LinkedHashMap<Character, Integer> countOfEachCharacterInAString(String str){
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
       return hm;
    }
}
