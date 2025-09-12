import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class Intersection {
    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ouput = intersectionUsingTwoHashSets(nums1,nums2);
        for(int n:ouput){
            System.out.print(n+" ");
        }
//        int[] finalArray = intersection(nums1,nums2);
//        for(int element:finalArray){
//            System.out.print(element+" ");
//        }
    }
    public static int[] intersectionUsingTwoHashSets(int[] nums1,int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        for(int num1:nums1){
            set1.add(num1);
        }
        Set<Integer> ans = new HashSet<>();
        for(int num2:nums2){
           if(set1.contains(num2)){
               ans.add(num2);
           }
        }
        int[] output = new int[ans.size()];
       int i=0;
       for(int n:ans){
           output[i] = n;
           i++;
       }
        return output;
    }

   /* public static int[] intersection(int[] nums1,int[] nums2){
       // HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> arl = new ArrayList<>();
        for (int k : nums1) {
            for (int i : nums2) {
                if (k == i) {
                    if (arl.contains(k)) {
                       // System.out.println("This number is already present in the set");
                    } else {
                        arl.add(k);
                    }
                }
            }
        }
      //  ArrayList<Integer> al = new ArrayList<>(hs);
        Integer[] integerArray = arl.toArray(new Integer[0]);
        int[] finalArray = new int[integerArray.length];
        for(int i=0;i<finalArray.length;i++){
            finalArray[i]  = integerArray[i];
        }
        return finalArray;

    }*/
}
