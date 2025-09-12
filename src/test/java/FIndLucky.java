import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FIndLucky {
    public static void main(String[] args){
        int[] arr = {2,2,3,4};
        findLucky(arr);
    }
    public static void findLucky(int[] arr){

        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(count);
            hm.put(arr[i],count);
        }
        for(Map.Entry<Integer,Integer> eachPair:hm.entrySet()){
            if(eachPair.getKey().equals(eachPair.getValue())){
                al.add(eachPair.getValue());
            }
        }
        System.out.println(al);
    }
}
