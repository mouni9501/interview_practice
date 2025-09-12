import java.util.ArrayList;

public class PrimeNumberOrNot {
    public static void main(String[] args){
        int n = 19;
       primeNumberOrNot(n);
        //System.out.println(bool);
        ArrayList<Integer> primeNumbers = primeNumberSequence(n);
        System.out.println("Prime numbers sequence: "+primeNumbers);
    }
    public static void primeNumberOrNot(int n){
        if(n<=1){
            System.out.println("Not a prime number");
            return;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }

    public static ArrayList<Integer> primeNumberSequence(int n){
        ArrayList<Integer> al = new ArrayList<>();
        int start = 2 ;
        for(int i = start;i<=n;i++){
            int check =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    check++;
                }
            }
            if(check==2){
                al.add(i);
            }
        }
        return al;
    }
}
