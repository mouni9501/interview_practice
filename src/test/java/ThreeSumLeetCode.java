import java.util.*;

public class ThreeSumLeetCode {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSumLeetCode(nums);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSumLeetCode(int[] nums){
       // Set<Integer> hs = new HashSet<>();
        List<Integer> al = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null && nums.length<3){
            return result;
        }
        Arrays.sort(nums);  // important for two-pointer and duplicate skipping
        int n = nums.length;
        for(int i=0;i< n-2;i++) {
            // skip duplicate values for i
            if(i>0 && nums[i] == nums[i-1])
                continue;
            int left = i+1;
            int right = n-1;
            int target = -nums[i];  // we want nums[left] + nums[right] == -nums[i]

            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                left++;
            } else {
                right--;
            }
            }
        }
        return result;
    }
}
