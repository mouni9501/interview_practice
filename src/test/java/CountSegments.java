public class CountSegments {
    public static void main(String[] args){
        String s = "    foo    bar";
        int totalSegments =  countSegments(s);
        System.out.println("Total segments are: "+totalSegments);
    }

    public static int countSegments(String s){
        int count = 0;
        int finalResult =0;
        String[] st = s.split("\\s+");
        finalResult = st.length;
        return finalResult;



//        int count =0;
//        int finalResult =0;
//        String[] st = s.split(" ");
//        int length = st.length;
//        System.out.println("length of array is: "+st.length);
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' '){
//                count++;
//            }
//        }
//        finalResult = count+1;
//        return finalResult;
    }
}
