public class ArrayStringsAreEqual {
    public static void main(String[] args){
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean bool = arrayStringsAreEqual(word1,word2);
        System.out.println(bool);
    }

    public static boolean arrayStringsAreEqual(String[] word1,String[] word2){
       // StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String ssd = "";
        boolean bool = false;
        for (String s : word1) {
            //sb1.append(s);
            ssd = ssd.concat(s);
        }
        for(String st:word2){
            sb2.append(st);
        }
        if(ssd.equalsIgnoreCase((sb2.toString()))){
            bool = true;
        }
//        if(sb1.compareTo(sb2) == 0){
//            bool=true;
//        }
        return bool;
    }
}
