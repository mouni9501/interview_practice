public class IsPalindrome {
    public static void main(String[] args){
        String s = "ab_a";
        String st = "race a car";
      //  boolean bool =  isPalindromeUsingSplit(s);
       boolean bool = isPalindromeWithoutUsingSplit(st);
        System.out.println(bool);
    }

    public static boolean isPalindromeWithoutUsingSplit(String s){
        s= s.toLowerCase();
        int start = 0;
        int end = s.length()-1;
        boolean bool = true;
        while(start<end){

            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }

            while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            if(s.charAt(start) != s.charAt(end)){
                return bool = false;
            }

            start++;
            end--;
        }
        return bool;

        //bool = true;
    }

    public static boolean isPalindromeUsingSplit(String s){
        boolean bool = false;
        String[] st = s.toLowerCase().split("[\\W_]+");
        StringBuilder sb = new StringBuilder();
        for(String str:st){
            sb.append(str);
        }
        String text = sb.toString();

        System.out.println("Text is:"+text);
        char[] ch = text.toCharArray();
        StringBuilder stb = new StringBuilder();
        for(int i=ch.length-1;i>=0;i--){
            stb.append(ch[i]);
        }
        System.out.println("stb is: "+stb);

        if((stb.toString()).equals(text)){
           bool = true;
        }
        return bool;
    }


}
