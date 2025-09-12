public class TruncateSentence {
    public static void main(String[] args){
        String s = "What is the solution to this problem";
        int k = 4;
        String afterTruncatingSentence = truncateSentence(s,k);
        System.out.println("After truncating the sentence: "+afterTruncatingSentence);

    }
    public static String truncateSentence(String s,int k){
        String[] st = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            sb = sb.append(st[i]+" ");
        }
        return sb.toString().trim();
    }
}
