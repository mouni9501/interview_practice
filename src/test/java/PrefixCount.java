public class PrefixCount {
    public static void main(String[] args){
        String[] words = {"leetcode","win","loops","success"};
        String pref ="code";
        int count = prefixCount(words,pref);
        System.out.println(count);
    }
    public static int prefixCount(String[] words,String pref){
        int count =0;
        int length = pref.length();
        for(String word:words){
            if(word.length()>=pref.length()){
                String subString = word.substring(0,length);
                if(subString.equalsIgnoreCase(pref)){
                    count++;
                }
            }
        }
        return count;
    }
}
