import java.util.ArrayList;

public class PlusOne {
    public static void main(String[] args){
        int [] digits = {1,2,3};
       int[] result =  plusOne(digits);
       for(int num:result){
           System.out.print(num+" ");
       }
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ne = new int[n + 1];
        ne[0] = 1;
        return ne;
    }
}
