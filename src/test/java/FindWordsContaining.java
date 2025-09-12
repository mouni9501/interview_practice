import java.util.ArrayList;

public class FindWordsContaining {
    public static void main(String[] args){
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x ='a';
        ArrayList<Integer> indices = findWordsContaining(words,x);
        for(int index: indices){
            System.out.print(index+" ");
        }
    }

    public static ArrayList<Integer>  findWordsContaining(String[] words,char x){
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(char ch :words[i].toCharArray()){
                if(ch == x){
                    indices.add(i);
                    break;
                }
            }
        }
        return indices;

    }
}
