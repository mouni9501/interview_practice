import java.util.HashMap;

public class FindTheDifference {
    public static void main(String[] args){
        String s = "a";
        String t = "aa";
        char result = findTheDifference(s,t);
        System.out.println(result);
    }
    public static char findTheDifference(String s,String t) {
        HashMap<Character,Integer> freq = new HashMap<>();
        char result = ' ';
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for(char ch:t.toCharArray()){
            int count = freq.getOrDefault(ch,0);
            if(count==0)
                result = ch;
            if(count>=1){
                count = freq.put(ch,count-1);
            }
        }
       return result;
    }
//        char result = ' ';
//        if(s.length()==t.length()){
//            return result;
//        }
//        for(char c:s.toCharArray()){
//            for(char ch:t.toCharArray()){
//                if(c!=ch){
//                     result = ch;
//                }
//            }
//        }
//        return result;
//    }
}
