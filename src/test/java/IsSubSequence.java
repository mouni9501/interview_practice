public class IsSubSequence {
    public static void main(String[] args){
        String s = "bb";
        String t = "ahbgdc";
        Boolean bool = isSubSequence(s,t);
        System.out.println(bool);
    }
    public static Boolean isSubSequence(String s,String t){
        int i=0;
        int j=0;
        boolean bool = false;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==s.length()){
            bool = true;
        }
        return bool;

       /* int count = 0;
        boolean bool = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t.length();i++){
            for(int j=0;j<s.length();j++){
                if(t.charAt(i)==s.charAt(j)){
                    sb.append(t.charAt(i));
                   count++;
                }
            }
        }
        if(s.equalsIgnoreCase(sb.toString()) ){
            bool = true;
        }
        return bool; */
    }
}
