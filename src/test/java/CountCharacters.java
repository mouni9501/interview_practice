import java.util.HashMap;

public class CountCharacters {
    public static void main(String[] args){
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
    }
    public static boolean countCharacters(String[] words,String chars){
        int length = chars.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:chars.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(String word:words){
            if(word.length()>length){
                break;
            }else{
                for(char c:word.toCharArray()){
                    int count = hm.getOrDefault(c,0);
                    if(count==0)
                        return false;
                    count = hm.put(c,count-1);
                }
            }
        }
        return true;
    }
}
