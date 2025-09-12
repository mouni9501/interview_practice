import java.util.HashMap;
import java.util.Map;
public class CountWordOccurences {
    public static void main(String[] args){
        String str = "India is my country. My country is India.";
        HashMap<String,Integer> hm = countWordOccurrences(str);
        for(Map.Entry<String,Integer> eachPair:hm.entrySet()){
            System.out.println(eachPair.getKey()+" "+eachPair.getValue());
        }
    }
    public static HashMap<String,Integer>  countWordOccurrences(String str){
        String[] st = str.toLowerCase().split("\\W+");
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i=0;i<st.length;i++){
            hm.put(st[i],hm.getOrDefault(st[i],0)+1);
        }

        return hm;
    }
}
