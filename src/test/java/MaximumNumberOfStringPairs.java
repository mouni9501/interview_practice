

public class MaximumNumberOfStringPairs {
    public static void main(String[] args){
        String[] words = {"aa","ab"};
        int count = maximumNumberOfStringPairs(words);
        System.out.println(count);

    }
    public static int maximumNumberOfStringPairs(String[] words){
        int count = 0;
        for(int i=0;i<words.length;i++){
            String word = words[i];
            for(int j=i+1;j<words.length;j++){
                String st = reverseAWord(words[j]);
                if(word.equalsIgnoreCase(st)){
                    count = count+1;
                }
            }
        }
        return count;
    }

    public static String reverseAWord(String wo){
        StringBuilder sb = new StringBuilder();
        for(int i=wo.length()-1;i>=0;i--){
            sb.append(wo.charAt(i));
        }
        return sb.toString();
    }
}
