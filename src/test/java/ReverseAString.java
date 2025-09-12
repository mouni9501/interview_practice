public class ReverseAString {
    public static void main(String[] args){
        String str = "mounika";
        String result = reverseAString(str);
        System.out.println("After reversing the string: "+result);
    }

    public static  String reverseAString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i =str.length()-1;i>=0;i--){
            sb = sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
