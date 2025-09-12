public class FindLengthOfLCIS {
    public static void main(String[] args){
        int[] nums = {2,2,2,2,2,2};
        int maxCount = findLengthOfLCIS(nums);
        System.out.println(maxCount);
    }
    public static int findLengthOfLCIS(int[] nums){
        int count =1;
        int maxCount =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }else{
                count =1;
            }
            if(count>maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}
