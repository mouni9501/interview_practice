import java.util.ArrayList;

public class TargetIndices {
    public static  void main(String[] args){
        int[] nums = {1,2,5,2,3};
        int target = 2;
        ArrayList<Integer> indices = targetIndices(nums,target);
        for(int num:indices){
            System.out.print(num+" ");
        }
    }
    public static ArrayList<Integer> targetIndices(int[] nums , int target){
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<=nums.length-1;j++){
                if(nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                indices.add(i);
            }
        }
        return indices;
    }
}
