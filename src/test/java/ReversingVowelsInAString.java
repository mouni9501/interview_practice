public class ReversingVowelsInAString {
    public static void main(String[] args){
        String s = "IceCreAm";
        String afterReversingTheVowels = reversingVowelsInAString(s);
        System.out.println("After reversing the vowels: "+afterReversingTheVowels);
    }

    public static String reversingVowelsInAString(String s) {

        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            while (start < end && !isVowel(chars[start])){
                start++;
            }
            while (start < end && !isVowel(chars[end])){
                end--;
            }

            if(start<end){
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }

    public static Boolean isVowel(char c){
        boolean bool = false;
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
         c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            bool = true;
        }
        return bool;
    }


      /*  int[] vowelsPositions = new int[s.length()-1];
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||
            s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
               vowelsPositions[count] = i;
               count++;
            }
        }
        for(int i=0;i<s.length();i++){
            for(int j=0;j<vowelsPositions.length;j++){
                if(i==vowelsPositions[j]){

                }
            }
        }*/

}
