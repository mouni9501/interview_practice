import java.util.ArrayList;

public class StringMatching {
    public static void main(String[] args){
        String[] words = {"mass","as","hero","superhero"};
        ArrayList<String> al = stringMatching(words);
        for(String word:al){
            System.out.print(word+" ");
        }
    }

    public static ArrayList<String> stringMatching(String[] words){

        ArrayList<String> al = new ArrayList<>();
            for (int m = 0; m < words.length; m++) { // m= 0
                for (int n = 0; n < words.length; n++) { //n=1 //n=2
                    if(m!=n && words[n].contains(words[m])){
                        if(!(al.contains(words[m]))){
                            al.add(words[m]);
                        }
                    }
                }
            }
        return al;
    }
}
