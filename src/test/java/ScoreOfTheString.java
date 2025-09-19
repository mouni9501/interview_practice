public class ScoreOfTheString {
    public static void main(String[] args){
        String s = "zaz";
        int difference = scoreOfTheString(s);
        System.out.println(difference);
    }
    public static int scoreOfTheString(String s){
        int difference = 0;
        char[] ch = s.toCharArray();
        int[] values = new int[ch.length];
        for(int i=0;i<ch.length;i++){
            values[i] = (int)ch[i];
        }
        if(values.length ==1){
            return values[0];
        }
        for(int i=0;i<values.length-1;i++){
            difference = difference + Math.abs(values[i] - values[i+1]);
        }
        return difference;
    }
}
