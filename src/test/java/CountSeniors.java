public class CountSeniors {
    public static void main(String[] args){
        String[] details = {"1313579440F2036","2921522980M5644"};
        int result = countSeniors(details);
        System.out.println(result);
    }
    public static int countSeniors(String[] details){
        int count = 0;
        for (String detail : details) {
            String subString = detail.substring(11, 13);
            int age = Integer.parseInt(subString);
            if (age > 60) {
                count = count + 1;
            }
        }
        return count;
    }
}
