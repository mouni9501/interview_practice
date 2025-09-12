public class AddDigits {
    public static void main(String[] args){
        int num =199;
        int result = addDigits(num);
        System.out.println("Final result: "+result);
    }
    public static int addDigits(int num){
        while(num>=10){
            int sum =0;
            while (num>0){
                int digit = num%10;
                System.out.println(digit);
                sum = sum+digit;
                num = num/10;
            }
            num = sum;
        }
            return num;
        }

    }

