import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args){
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean bool = wordPattern(pattern,s);
        System.out.println(bool);
    }
    public static boolean wordPattern(String pattern,String s){
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String> p2w = new HashMap<>();
        HashMap<String,Character> w2p = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(p2w.containsKey(c) && !p2w.get(c).equals(word)){
                return false;
            }

            if(w2p.containsKey(word) && w2p.get(word) != c){
                return false;
            }

            p2w.put(c,word);
            w2p.put(word,c);
        }

        return true;
    }
}
