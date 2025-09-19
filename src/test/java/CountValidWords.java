public class CountValidWords {
    public static void main(String[] args){
        String sentence = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.";
        int result = countValidWords(sentence);
        System.out.println(result);
    }
    public static int countValidWords(String sentence){
        String[] words = sentence.split("\\s+");
        int count = 0;
        for(String word:words){
            char[] ch = word.toCharArray();
            boolean valid = true;
            for(int i=0;i<ch.length;i++){
                if(!Character.isLetter(ch[i])){
                    valid = false;
                    break;
                }
            }
            if(valid==true && ch.length>0){
                count++;
            }
        }
        return count;
     }
}
