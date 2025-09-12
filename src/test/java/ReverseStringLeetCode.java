public class ReverseStringLeetCode {
    public static void main(String[] args){
        char[] s  = {'h','e','l','l','o'};
        revrseStringLeetCode(s);

    }
    public static void revrseStringLeetCode(char[] s){
        int start = 0;
        int end = s.length-1;
        char z = ' ';
        while(start<end){
            z = s[start];
            s[start] = s[end];
            s[end] = z;

            start++;
            end--;
        }
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
