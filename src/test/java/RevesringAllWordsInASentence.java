public class RevesringAllWordsInASentence {
    public static void main(String[] args){
        String sentence = "hello how are you";
        String finalResult = revesringAllWordsInASentence(sentence);
        System.out.println("After reversing: "+finalResult);

    }
    public static String revesringAllWordsInASentence(String str){
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        for(int i=0;i<s.length;i++){
          String reverse =  reverseEachWord(s[i]);
          sb.append(reverse);
          sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static String reverseEachWord(String st){
        StringBuilder sb= new StringBuilder();
        for(int i =st.length()-1;i>=0;i--){
            sb = sb.append(st.charAt(i));

        }

        return sb.toString();
    }
}
