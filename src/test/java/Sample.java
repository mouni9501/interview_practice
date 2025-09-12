public class Sample {
    public static void main(String[] args){
        String s = "mOuNiKa";
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<c.length;i++){
            if(i%2==0){
               sb.append(Character.toUpperCase(c[i])) ;
            }
            else
                sb.append(Character.toLowerCase(c[i]));
        }
        System.out.println(sb);
    }
}
