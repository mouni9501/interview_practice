public class Fib {
    public static void main(String[] args){
        int n=4;
        int fib = fib(n);
        System.out.println(fib);
    }
    public static int fib(int n){

        int sum =0;
        if(n==0){
            return 1;
        }
        if(n>1){
           sum = sum +fib(n-1)+fib(n-2);
        }
        return sum;
    }
}
