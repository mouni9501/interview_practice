public class IsSubStringPresent {
    public static void main(String[] args){
        String s = "abcd";
        boolean bool = isSubStringPresent(s);
        System.out.println(bool);
    }

    public static boolean isSubStringPresent(String s){
        boolean bool = false;
        String reversedString = reverseAString(s);
        String[] reversedSubStrings = new String[s.length()-1];
        for(int i=0;i<reversedString.length()-1;i++){
            String sub = reversedString.substring(i,i+2);
            reversedSubStrings[i] = sub;
        }
        String[] subStrings = new String[s.length()-1];
        for(int i =0;i<s.length()-1;i++){
            String subString = s.substring(i,i+2);
            subStrings[i] = subString;
        }

        for(int i=0;i<reversedSubStrings.length;i++){
            for(int j=0;j<subStrings.length;j++){
                if(reversedSubStrings[i].equals(subStrings[j])){
                    bool = true;
                    break;
                }
            }
        }

        return bool;
    }

    public static String reverseAString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
