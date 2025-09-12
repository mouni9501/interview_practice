public class MajorityElement {
    public static void main(String[] args){
        int[] nums = {3,2,3};
        int result = majorityElement(nums);
        System.out.println(result);
    }
    public static int majorityElement(int[] nums){
        int num = nums.length/2;
        int requiredNumber = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]==nums[j]){
                    count = count+1;
                }
            }

            System.out.println("count is: "+count+ "   "+"number is: "+nums[i]);
            if(count>num){
                requiredNumber = nums[i];
                break;
            }
        }
       return requiredNumber;
    }
}
