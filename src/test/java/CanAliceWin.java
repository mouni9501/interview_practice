
public class CanAliceWin {
    public static void main(String[] args){
        int[] nums = {5,5,5,25};
        boolean bool = canALiceWin(nums);
        System.out.println(bool);
    }
    public static boolean canALiceWin(int[] nums){
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        for (int num : nums) {
            if (num <= 9) {
                singleDigitSum = singleDigitSum + num;
            } else {
                doubleDigitSum = doubleDigitSum + num;
            }
        }
     boolean bool = true;
     if(singleDigitSum == doubleDigitSum){
         bool = false;
     }
        return bool;
    }
}
