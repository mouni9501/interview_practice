public class IsPrefixOfWord {
    public static void main(String[] args){
        String sentence = "i am tired";
        String searchWord = "pro";
        int index = isPrefixOfWord(sentence,searchWord);
        System.out.println(index);
    }
    public static int isPrefixOfWord(String sentence,String searchWord){
        int index = -1;
        int searchWordLength = searchWord.length();
        String[] st = sentence.split(" ");
        for(int i=0;i<st.length;i++){
            if(st[i].length()>=searchWordLength){
                String subString = st[i].substring(0,searchWordLength);
                if(subString.equalsIgnoreCase(searchWord)){
                    index = i+1;
                    break;
                }
            }
        }
        return index;
    }
}
