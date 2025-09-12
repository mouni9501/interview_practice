import java.util.HashMap;
import java.util.Map;
public class SumOfUnique {
    public static void main(String[] args){
        int[] nums = {1,2,3,2};
        int sum = sumOfUnique(nums);
        System.out.println(sum);
    }
    public static int sumOfUnique(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int sum = 0;
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> eachPair:hm.entrySet()){
            if(eachPair.getValue()==1){
                sum = sum+eachPair.getKey();
            }
        }
        return sum;
    }
}
