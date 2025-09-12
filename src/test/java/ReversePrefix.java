public class ReversePrefix {
    public static void main(String[] args){
        String word = "abcd";
        char ch = 'z';
        String finalResult = reversePrefix(word,ch);
        System.out.println(finalResult);
    }
    public static String reversePrefix(String word, char ch){
       int index = -1;
       for(int i=0;i<word.length();i++){
           if (word.charAt(i)==ch){
               index=i;
               break;  // stop at first occurrence
           }
       }

       if(index == -1){ // if ch not found, return word as is
           return word;
       }

       // otherwise split into two parts
       String prefix = word.substring(0,index+1);
       String suffix = word.substring(index+1);

       return  reverse(prefix)+suffix;
    }

    public static String reverse(String st){
     StringBuilder sb = new StringBuilder();
     for(int i=st.length()-1;i>=0;i--){
         sb.append(st.charAt(i));
     }
     return sb.toString().trim();
    }
}
