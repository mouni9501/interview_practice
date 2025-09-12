
import java.util.HashMap;

public class AreOccurrencesEqual {
    public static void main(String[] args){
        String s = "abacbc";
        boolean bool = areOccurrencesEqual(s);
        System.out.println(bool);

    }
    public static boolean areOccurrencesEqual(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
       // HashSet<Integer> occurrencesCount = new HashSet<>();
        boolean bool = false;
        char[] c = s.toCharArray();
        for (char value : c) {
            hm.put(value, hm.getOrDefault(value, 0) + 1);
        }
//        for(Map.Entry<Character,Integer> eachPair:hm.entrySet()){
//            occurrencesCount.add(eachPair.getValue());
//        }
        if(hm.values().stream().distinct().count()==1){
            bool = true;
        }
            return bool;
    }
}
