import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SortingNumbersInASentence {
    public static void main(String[] args){
        String str = "abc3423235sdfbjsdh9878678sdfsb345";
        LinkedHashSet<Integer> al = sortingNumbersInASentence(str);
        for(int number:al){
            System.out.print(number+" ");
        }
    }
    public static LinkedHashSet<Integer> sortingNumbersInASentence(String str){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if((int) str.charAt(i) >= 48 && (int) str.charAt(i) <=57){
                int value = (int) str.charAt(i);
                al.add(value - 48);
            }
        }

        Collections.sort(al,Collections.reverseOrder());
        //reverseOrder(al);
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(al);
        return lhs;
    }
}
