public class FindIndexOfFirstOccurenceInAString {
    public static void main(String[] args){
        String haystack = "mississippi";
        String needle = "pi";
       int index =  findIndexOfFirstOccurrenceInAString(haystack,needle);
        System.out.println("index is: "+index);

    }
    public static int findIndexOfFirstOccurrenceInAString(String haystack,String needle){
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0; // empty string case
        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
        //-------------------

       /* int index = haystack.indexOf(needle); // built-in efficient search

        return index;  */

        //----------------------

       /* int haystackLength = haystack.length();
        int needleLength = needle.length();
        if(haystackLength==needleLength){
            if(haystack.equalsIgnoreCase(needle)){
                return 0;
            }
        } else if (haystackLength>1 && needleLength==1) {
            char ch = needle.charAt(0);
            for(int i=0;i<haystackLength;i++){
               char c = haystack.charAt(i);
               if(c==ch){
                   return i;
               }
            }
        }

        int index = -1;
        for(int i=0;i<haystack.length();i++){
            for(int j=i+1;j<=haystack.length();j++){
                String sub = haystack.substring(i,j);
                if(sub.equalsIgnoreCase(needle)){
                   return i;
                    //break;
                }
            }
        }
        return index;*/
    }
}
