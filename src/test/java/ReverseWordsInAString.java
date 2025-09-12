import java.util.Objects;

public class ReverseWordsInAString {
    public static void main(String[] args){
        String s = "a good   example";
        String result = reverseWordsInAString(s);
        System.out.println(result);
    }
    public static String reverseWordsInAString(String s){
        String[] st = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=st.length-1;i>=0;i--){
           if(st[i]==null || st[i] == ""){

           }else{
               sb.append(st[i]).append(" ");
           }
        }
        return sb.toString().trim();
    }
}
