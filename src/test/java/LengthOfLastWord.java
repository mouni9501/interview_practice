public class LengthOfLastWord {
    public static void main(String[] args){
         String s = "   fly me   to   the moon  ";
         int lengthOfLastWord = lengthOfLastWord(s);
         System.out.println("Length of last word is: "+lengthOfLastWord);

    }
    public static int lengthOfLastWord(String s){
        String[] str = s.split(" ");
        int length = str.length;
        int lengthOfLastWord = 0;
        for(int i=length-1;i>=0;i--){
           if(str[i]!=" "){
              lengthOfLastWord  = str[i].length();
              break;
           }
       }
        return lengthOfLastWord;
    }
}
