public class MovingZeroesToLeft {
    public static void main(String[] args){
        int[] nums = {1,3,12,0,10,11,0,50 };
        int[] result = movingZeroesToLeft(nums);
        for(int num:result){
            System.out.print(num+" ");
        }

    }
    public static int[] movingZeroesToLeft(int[] nums){
        int n = nums.length;
        int index = n-1;  // place for non-zero elements (from right to left)

        // Traverse from right to left
        for(int i = n-1;i>=0;i--){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index--;
            }
        }
       // Fill remaining positions with zeros
        while(index>=0){
            nums[index] =0;
            index--;
        }

       /* int count = 0;
        int arr[] =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(nums[i]!=0){
                arr[count] = nums[i];
                count++;
            }
        }
        return arr;*/

        return nums;
    }
}
