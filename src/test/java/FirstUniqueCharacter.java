public class FirstUniqueCharacter {
    public static void main(String[] args){
        String s = "aabb";
        int  firstUniqueCharacterIndex = firstUniqueCharacter(s);
        System.out.println("first unique character index is: "+firstUniqueCharacterIndex);
    }
    public static int firstUniqueCharacter(String s){
        char[] ch = s.toCharArray();
        int index = -1;
        for(int i=0;i<ch.length;i++){
            boolean isUnique = true;
            int count = 0;
          for(int j=0;j<ch.length;j++){
            if(i!=j && ch[i]==ch[j]){
                isUnique = false;
                break;
            }
          }
            if(isUnique){
                return i;
            }
        }
        return index;
    }
}
