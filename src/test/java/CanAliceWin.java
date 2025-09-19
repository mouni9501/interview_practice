import java.util.ArrayList;
import java.util.Arrays;

public class CanAliceWin {
    public static void main(String[] args){
        int[] nums = {5,5,5,25};
        boolean bool = canALiceWin(nums);
        System.out.println(bool);
    }
    public static boolean canALiceWin(int[] nums){
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
     for(int i=0;i<nums.length;i++){
         if(nums[i]<=9){
             singleDigitSum = singleDigitSum + nums[i];
         }else{
             doubleDigitSum = doubleDigitSum + nums[i];
         }
     }
     boolean bool = true;
     if(singleDigitSum == doubleDigitSum){
         bool = false;
     }
        return bool;
    }
}
