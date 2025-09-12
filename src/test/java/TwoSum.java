public class TwoSum {
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums,target);
        System.out.print("Indices are: "+result[0]+" "+result[1]);
    }
    public static int[] twoSum(int[] nums,int target){
        int sum = 0;
        int[] indices = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                sum= nums[i]+nums[j];
                if(sum == target){
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        return indices;
    }
}
