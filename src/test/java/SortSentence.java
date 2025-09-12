import java.util.HashMap;
import java.util.Map;

public class SortSentence {
    public static void main(String[] args){
        String s = "is2 sentence4 This1 a3";
        String result = sortSentence(s);
        System.out.println(result);
//        for(String st:result){
//            System.out.print(st+" ");
//        }
    }

    public static String sortSentence(String s){
        String[] st = s.split(" ");
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<st.length;i++){
            //we are getting each number at the end of each word
            int lastIndex = st[i].length()-1;
            System.out.println("LastIndex is: "+lastIndex);
            //Since characters in java are stored in ASCII values after getting
            // each number subtracting that from the 0 (48 ascii value) to get the index
            int index = st[i].charAt(lastIndex)-'0';
            System.out.println("index is: "+index);
            String actualWord = st[i].substring(0,lastIndex);
            hm.put(index,actualWord);
        }

        for(Map.Entry<Integer,String> eachPair: hm.entrySet()){
            sb.append(eachPair.getValue());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

//    public static String[] sortSentence(String s){
//        String[] st = s.split(" ");
//        String[] str = new String[st.length];
//        int index;
//        for(int i=0;i<st.length;i++){
//           index  =  Character.getNumericValue(st[i].charAt(st[i].length()-1));
//            System.out.println(index);
//           str[index-1] = st[i].substring(0,st[i].length()-1);
//            System.out.println(str[i]);
//        }
//        return str;
//    }
}
