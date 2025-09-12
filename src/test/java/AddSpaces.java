public class AddSpaces {
    public static void main(String[] args){
        String s = "spacing";
        int[] spaces = {0,1,2,3,4,5,6};
        String result= addSpaces(s,spaces);
        System.out.print(result);
    }
    public static String addSpaces(String s,int[] spaces){
       StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            for (int space : spaces) {
                if (i  == space) {
                     sb.append(" ");
                }
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
