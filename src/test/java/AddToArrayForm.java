import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class AddToArrayForm {
    public static void main(String[] args){
        int [] num = {1,2,0,0};
        int k = 1;
        List<Integer> result = addToArrayForm(num,k);
        System.out.println(result);
    }
    public static List<Integer> addToArrayForm(int[] num,int k){
        StringBuilder sb = new StringBuilder();
        List<Integer> al = new ArrayList<>();
        for (int j : num) {
            String st = Integer.toString(j);
            sb.append(st);
        }
        int digit = Integer.parseInt(sb.toString());
        int sum = digit+k;

        while(sum > 0){
            al.add(sum%10);
            sum = sum /10;
        }
        Collections.reverse(al);
        return al;
    }
}
