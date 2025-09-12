public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        String commonPrefix = longestCommonPrefix(strs);
        System.out.println(commonPrefix);
    }
    public static String longestCommonPrefix(String[] strs){
        String st = strs[0];
        String subString = "";
        if(strs.length ==0 || strs == null){
            return "";
        }
        for(int i=0;i<st.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i >= strs[j].length() || st.charAt(i)!=strs[j].charAt(i)){
                    subString = st.substring(0,i);
                    return subString;
                }
            }
        }
        return st;
    }
}
