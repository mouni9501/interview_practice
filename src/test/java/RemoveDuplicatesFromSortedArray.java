import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] arr = {1,1,2};
        int size = removeDuplicatesFromSortedArray(arr);
        System.out.println("Size of sorted array after removing the duplicates: "+size);
    }
    public static int removeDuplicatesFromSortedArray(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                System.out.println("This number is already present in the set");
            }
            else{
                hs.add(arr[i]);
            }
        }
        ArrayList<Integer> al = new ArrayList<>(hs);

        for(int num:al){
            System.out.print(num+" ");
        }
        Collections.sort(al);
        System.out.println(al);
        return al.size();
    }
}
