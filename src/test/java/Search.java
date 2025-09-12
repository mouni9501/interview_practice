public class Search {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int index = search(nums,target);
        System.out.println("index is :"+index);
    }
    public static int search(int[] nums,int target){
        int index = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                index = i;
                break;
            }
        }
        return index;
    }
}
