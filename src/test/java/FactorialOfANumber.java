public class FactorialOfANumber {
    public static void main(String[] args){
        int n= 15;
//        int fact = factorialOfANumber(n);
//        System.out.println(fact);
        int result = factorialOfANumberUsingRecursion(n);
        System.out.println(result);

    }
    public static int factorialOfANumber(int n){
        if(n<0){
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static int factorialOfANumberUsingRecursion(int n){
        if(n<0){
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        if(n==0||n==1)
            return 1;

        if(n>1)
            return n*factorialOfANumberUsingRecursion(n-1);
        return n;
    }
}
