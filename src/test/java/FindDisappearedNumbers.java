import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDisappearedNumbers {
    public static void main(String[] args){
        int[] nums = {1,1};
        ArrayList<Integer> missingNumbers= findDisappearedNumbers(nums);
        System.out.println(missingNumbers);
    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] nums){
        ArrayList<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> numbers = new HashSet<Integer>();
        for(int num:nums){
          numbers.add(num);
        }
        System.out.println("numbers in the set:"+numbers);
        for(int i=1;i<=nums.length;i++){
            if(!numbers.contains(i)){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
}
