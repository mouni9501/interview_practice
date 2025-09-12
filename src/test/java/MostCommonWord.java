import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args){
        String paragraph = "a.";
        String[] banned = {""};
        String result = mostCommonWord(paragraph, banned);

    }

    public static String  mostCommonWord(String paragraph,String[] banned){
        String[] st = paragraph.toLowerCase().split(" ");
        HashMap<String,Integer> hm = new HashMap<>();
        int freq =0;
        String mostCommonWord ="";

        for (String s : st) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (Character.isLetter(c)) {
                    sb.append(c);
                }
            }
            if (!sb.isEmpty()) { // avoid empty strings
                String cleanedWord = sb.toString();
                hm.put(cleanedWord, hm.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        for(Map.Entry<String,Integer> eachPair:hm.entrySet()){
            for(String bannedWord:banned){
               // System.out.println("Banned word is: "+bannedWord);
                if(!eachPair.getKey().equals(bannedWord)){
                   // System.out.println(eachPair.getKey()+ " "+eachPair.getValue());
                    int value = eachPair.getValue();
                   if(freq<value){
                     //  System.out.println("frequency is :" +freq);
                       freq = eachPair.getValue();
                       mostCommonWord = eachPair.getKey();
                   }
                }
            }
        }
        System.out.println("Most common word is: " +freq+" "+mostCommonWord);
        return mostCommonWord;
    }
}
