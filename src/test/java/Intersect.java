import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersect {  //output will accept duplicates also
    public static void main(String[] args){
        int[] nums1 = {1, 2,2,2, 3};
        int[] nums2 = {2,2,4,1};
        int[] result = intersect(nums1,nums2);
        for(int nu:result){
            System.out.print(nu+" ");
        }

    }

public static int[] intersect(int[] nums1,int[] nums2){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<nums1.length;i++){
            for(int j =0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    al.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] result = new int[al.size()];
        for(int m=0;m<result.length;m++){
            result[m] = al.get(m);
        }
        return result;
}






//    public static int[] intersect(int[] nums1,int[] nums2){
//        ArrayList<Integer> al = new ArrayList<>();
//        boolean[] used = new boolean[nums2.length];
//
//        for (int i=0;i<nums1.length;i++) {
//            for (int j=0;i<nums2.length;i++) {
//                if (!used[j] && nums1[i] == nums2[j]) {
//                    al.add(nums2[j]);
//                    used[j] = true;
//                    break;
//                }
//            }
//        }
//        int[] result = new int[al.size()];
//       for(int i=0;i<result.length;i++)
//           result[i] = al.get(i);
//
//        return result;
//    }
}
