import java.util.Map;
import java.util.LinkedHashMap;
public class FrequencyOfLetterGreaterThanOne {
    public static void main(String[] args){
        String str = "Automation";
        String result = frequencyOfLetterGreaterThanOne(str);
        System.out.println(result);
    }
    public static String frequencyOfLetterGreaterThanOne(String str){
        Map<Character,Integer> freq = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c:str.toLowerCase().toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for(char c:str.toLowerCase().toCharArray()){
            if(freq.get(c)>1){
                sb.append(freq.get(c));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
