public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 7;
        int insertPosition = searchInsertPosition(nums,target);
        System.out.println(insertPosition);

    }
    public static int searchInsertPosition(int[] nums,int target){
        int insertPosition = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i]>target){
                insertPosition = i;
                break;
            }else{
                insertPosition = i+1;
            }
        }
        return insertPosition;
    }
}
