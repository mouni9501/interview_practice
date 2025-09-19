import java.util.ArrayList;

public class CommonCharacters {
    public static void main(String[] args){
        String[]  s = {"bella","label","roller"};


    }
    public static void commonCharacters(String[] s){
        String st = s[0];
        char[] ch = s[0].toCharArray();
        for(int i=1;i<s.length;i++){
            char[] c = s[i].toCharArray();
            for(int j =0;j<ch.length;j++){
                if(ch[j] == c[j]){

                }
            }
        }

    }
}
