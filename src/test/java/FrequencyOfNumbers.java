import java.util.Map;
import java.util.HashMap;
public class FrequencyOfNumbers {
    public static void main(String[] args){
        int num = 11223344;
        Map<Character,Integer> freq = frequencyOfNumbers(num);
        for(Map.Entry<Character,Integer> eachPair: freq.entrySet()){
            System.out.println(eachPair.getKey()+" - "+eachPair.getValue());
        }
    }
    public static Map<Character,Integer> frequencyOfNumbers(int num){
        String st = Integer.toString(num);
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : st.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
       return freq;
     }
}
