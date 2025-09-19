public class ReverseStringsInSentenceByModifyingInitialLetters {
    public static void main(String[] args){
        String str = "Mounika Javvaji";
        String result = reverseString(str);
        System.out.println(result);
    }

    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        String[] st = str.split(" ");
        for(int i=0;i<st.length;i++){
            String s = reverse(st[i]);
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            if(i==s.length()-1){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else if(i==0){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
