public class CheckIfPangram {
    public static void main(String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

    }
    public static boolean checkIfPangram(String sentence){
        if(sentence.length()<26){
            return false;
        }


        return true;
    }
}
