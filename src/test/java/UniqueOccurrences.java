import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
public class UniqueOccurrences {
    public static void main(String[] args){
        int[] arr = {1,2,2,1,1,3};
        boolean bool = uniqueOccurrences(arr);
        System.out.println(bool);
    }
    public static boolean uniqueOccurrences(int[] arr){

        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        Set<Integer> mapValues = new HashSet<>();
        for(int count: freq.values()){
            if(mapValues.contains(count)){
                return false;
            }
            mapValues.add(count);
        }
        return true;
    }
}
