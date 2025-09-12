import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args){
        int[] nums = {1,1,2};
        ArrayList<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
    }
    public static ArrayList<Integer> findDuplicates(int[] nums){
        ArrayList<Integer> duplicates = new ArrayList<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> eachPair:freq.entrySet()){
            if(eachPair.getValue()>1){
                duplicates.add(eachPair.getKey());
            }
        }
        return duplicates;
    }
}
