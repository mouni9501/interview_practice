import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ThirdMax {
    public static void main(String[] args){
        int[] nums = {1,2};
        int maxNum = thirdMax(nums);
        System.out.println();
        System.out.println(maxNum);
    }
    public static int thirdMax(int[] nums){
        int num = 0;
        Set<Integer> hs = new LinkedHashSet<Integer>();
        for(int nu:nums){
            hs.add(nu);
        }
        System.out.println("set is: "+hs);
        int[] uniqueNumber = hs.stream().mapToInt(Integer::intValue).toArray();
//        for(int n:uniqueNumber){
//            System.out.print(n+" ");
//        }
        System.out.println();
       for(int i=0;i<uniqueNumber.length;i++){
           for(int j=i+1;j<uniqueNumber.length;j++){
               if(uniqueNumber[i]<uniqueNumber[j]){
                   int temp = uniqueNumber[i];
                   uniqueNumber[i] = uniqueNumber[j];
                   uniqueNumber[j] = temp;
               }
           }
       }
       for(int i=0;i<uniqueNumber.length;i++){
           System.out.println("After sorting: "+uniqueNumber[i]+" ");
       }
       if(uniqueNumber.length>=3){
           num = uniqueNumber[2];
       }else{
           num = uniqueNumber[0];
       }
        return num;
    }
}
