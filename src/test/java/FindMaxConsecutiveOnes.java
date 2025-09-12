public class FindMaxConsecutiveOnes {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};
        int maximumCount = findMaxConsecutiveOnes(nums);
        System.out.println(maximumCount);
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int maximumCount =0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]==1){
                    count++;
                    if(maximumCount>count){
                        maximumCount = count;
                    }
                }else{
                    count = 0;
                }
        }
        return maximumCount;
    }
}
