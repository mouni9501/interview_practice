public class CountPrefixes {
    public static void main(String[] args){
        String[] words = {"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"};
        String s = "w";
       int count =  countPrefixes(words,s);
        System.out.println(count);

    }
    public static int countPrefixes(String[] words,String s){
       int count = 0;
       for(String word:words){
           char firstCharacter = word.charAt(0);
           if(firstCharacter==s.charAt(0)){
               count++;
           }
       }
       return count;
    }
}

