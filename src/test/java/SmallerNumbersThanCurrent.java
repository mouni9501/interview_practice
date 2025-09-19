public class SmallerNumbersThanCurrent {
    public static void main(String[] args){
        int [] nums = {8,1,2,2,3};
        int[] output = smallerNumbersThanCurrent(nums);
        for(int num:output){
            System.out.print(num+" ");
        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if( i!=j && nums[i]>nums[j]){
                    count = count +1;
                }
            }
            output[i] = count;
        }
        return output;
    }
}
