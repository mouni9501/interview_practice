public class MissingNumber {
    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int finalNumber = missingNumber(nums);
        System.out.println(finalNumber);
    }
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int sum =0;
        int finalSum = n*(n+1)/2;
        for (int num : nums) {
            sum = sum + num;
        }

        return finalSum-sum;
    }
}
