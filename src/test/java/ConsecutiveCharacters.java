public class ConsecutiveCharacters {
    public static void main(String[] args){
        String str = "aaabbbccdda";
        String result = consecutiveCharacters(str);
        System.out.println(result);
    }

    public static String consecutiveCharacters(String str){
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<ch.length;i++){
            if(ch[i]==ch[i-1]){
                count++;
            }else{
                sb.append(ch[i-1]).append(count);
                count =1;
            }
        }
        sb.append(ch[ch.length-1]).append(count);
       return sb.toString();

    }
}
