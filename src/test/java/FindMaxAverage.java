public class FindMaxAverage {
    public static void main(String[] args){
        int[] nums = {1,0,1,4,2};
        int k = 4;
        double average = findMaxAverage(nums,k);
        System.out.println(average);
    }
    public static double findMaxAverage(int[] nums,int k){
        int sum = 0;
        double average =0.0;
        for(int i=0;i<=k;i++){
            sum = sum+nums[i];
        }
        average = sum/k;
        return average;
    }

}
