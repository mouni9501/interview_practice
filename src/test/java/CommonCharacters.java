import java.util.ArrayList;

public class CommonCharacters {
    public static void main(String[] args){
        String[]  s = {"bella","label","roller"};
        ArrayList<Character> al = commonCharacters(s);
        System.out.println(al);

    }
    public static ArrayList<Character> commonCharacters(String[] s){
        char[] ch = s[0].toCharArray();
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            char c = ch[i];
            for(int j=1;j<s.length;j++){
                if(i>=j && c==s[j].charAt(i)){
                   al.add(c);
                }
            }
        }
        return al;
    }
}
