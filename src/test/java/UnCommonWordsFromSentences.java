import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;

public class UnCommonWordsFromSentences {
    public static void main(String[] args){
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] result = unCommonWordsFromSentences(s1,s2);
        for(String eachString:result){
            System.out.print(eachString+" ");
        }
    }
    public static String[] unCommonWordsFromSentences(String s1,String s2){
        String[] st1 = s1.split(" ");
        String[] st2 = s2.split(" ");

        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<st1.length;i++){
            boolean isFound = false;
            for(int j=0;j<st2.length;j++){
                if((st1[i].equals(st2[j])) ){
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                al.add(st1[i]);
            }
        }

        for(int i=0;i<st2.length;i++){
            boolean isFound = false;
            for(int j=0;j<st1.length;j++){
                if((st2[i].equals(st1[j])) ){
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                al.add(st2[i]);
            }
        }
        return al.toArray(new String[0]); //new array created by Java internally.
        // Since Java 11, new String[0] is optimized, so it’s just as fast as new String[list.size()]
    }

    public static String[] unCommonWordsFromSentencesUsingHashmap(String s1,String s2){
        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        //combining two sentences and splitting them
        for(String word:(s1+" "+s2).split(" ")){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> eachPair:hm.entrySet()){
            if(eachPair.getValue() == 1){
                al.add(eachPair.getKey());
            }
        }
        return al.toArray(new String[al.size()]); //pre-sized array (Java reuses it if size matches)
    }
}
