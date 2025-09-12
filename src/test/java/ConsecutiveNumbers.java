import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 25, 6, 7, 8, 9, 2, 3, 10,11,12,13,14,15,16};
        consecutiveNumbers(arr);
    }

    public static void consecutiveNumbers(int[] arr) {
        ArrayList<Integer> current = new ArrayList<Integer>();
        ArrayList<Integer> maxCount = new ArrayList<Integer>();
        for(int i=0;i<arr.length-1;i++){
            current.clear();
            if(arr[i+1]==arr[i]+1){
                current.add(arr[i]);
                while(i<arr.length-1 && arr[i+1]==arr[i]+1){
                    current.add(arr[i+1]);
                    i++;
                }
            }
            if(current.size() > maxCount.size()){
                maxCount.clear();
                maxCount.addAll(current);
            }
        }
        System.out.println(maxCount);
    }
}