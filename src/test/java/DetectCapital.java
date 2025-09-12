public class DetectCapital {
    public static void main(String[] args){
        String word = "flaG";
       boolean bool =  detectCapital(word);
        System.out.println(bool);
    }

    public static Boolean detectCapital(String word){
        int capCount = 0;
        int lowCount =0;
        boolean bool = false;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                capCount++;
            }else if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                lowCount++;
            }
        }
        System.out.println("Capital Count is: "+capCount);
        System.out.println("Lower Count is: "+lowCount);
        if(capCount == word.length() || capCount ==0 || (capCount == 1 && word.charAt(0)>='A' && word.charAt(0)<='Z')){
            bool = true;
        }

        return bool;
    }
}
