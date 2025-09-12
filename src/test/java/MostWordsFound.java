public class MostWordsFound {
    public static void main(String[] args){
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int maxLength = mostWordsFound(sentences);
        System.out.println(maxLength);
    }
    public static int mostWordsFound(String[] sentences){
        int maxLength = 0;
        for(String sentence:sentences) {
            int length = sentence.split(" ").length;
            if(length>maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
