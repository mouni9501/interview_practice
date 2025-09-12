public class GetNoZeroIntegers {
    public static void main(String[] args){
        int n = 11;
        int[] requiredNumbers = getNoZeroIntegers(n);
        System.out.print(requiredNumbers[0]+" "+requiredNumbers[1]);
    }

    public static int[] getNoZeroIntegers(int n){
        for(int i=1;i<=n;i++){
            int j = n-i;
            if(isNoZero(i) && isNoZero(j)){
                return new int[]{i, j};
            }
        }
        return new int[0];
    }

    public static boolean isNoZero(int num){
        while(num>0){
            if(num % 10 ==0){
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
