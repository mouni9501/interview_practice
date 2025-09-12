public class MaxPower {
    public static void main(String[] args){
        String s = "abbcccddddeeeeedcba";
        int maxCount = maxPower(s);
        System.out.println(maxCount);
    }
    public static int maxPower(String s){
        int count = 1;
        int maxCount =1;
        for(int i=1;i<s.length();i++){
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }else{
                count =1;
            }
            if(count>maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}
