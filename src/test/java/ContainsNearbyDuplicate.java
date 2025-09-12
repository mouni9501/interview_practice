public class ContainsNearbyDuplicate {
    public static void main(String[] args){
        int[] nums = {99,99};
        int k = 2;
        boolean bool = containsNearbyDuplicate(nums,k);
        System.out.println(bool);
    }
    public static boolean containsNearbyDuplicate(int[] nums,int k){
        boolean bool = false;
        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if ((j-i)<=k){
                        bool=true;
                        break;
                    }
                }
            }
        }
        return bool;
    }
}
