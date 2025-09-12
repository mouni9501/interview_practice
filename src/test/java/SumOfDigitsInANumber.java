public class SumOfDigitsInANumber {
    public static void main(String[] args){
        int n= 678;
        int sum = sumOfDigitsInANumber(n);
        System.out.println(sum);

    }
    public static int sumOfDigitsInANumber(int n){
        int sum =0;
       while(n>0){
            sum = sum + n%10;
            n = n/10;
       }
       return sum;
    }
}
