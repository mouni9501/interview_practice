public class MaximumProduct {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int maxProduct = maximumProduct(nums);
        System.out.println(maxProduct);

    }
    public static int maximumProduct(int[] nums){
       int maxProduct = 0;
        for(int i= 0;i<nums.length;i++){
           for(int j =i+1;j<nums.length;j++){
               for(int k = j+1;k<nums.length;k++){
                   int product = nums [i] * nums[j] * nums[k];
                   if(product>maxProduct){
                       maxProduct = product;
                   }
               }
           }
        }
        return maxProduct;
    }
}
