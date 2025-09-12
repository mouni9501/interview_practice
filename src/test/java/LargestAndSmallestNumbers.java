public class LargestAndSmallestNumbers {
    public static void main(String[] args){
        int[] arr = {45,132,4,20,11,90,101};
        int[] result = largestAndSmallestNumbers(arr);
        System.out.println("Smallest number is: " +result[0]);
        System.out.println("Largest Number is: "+result[result.length-1]);
    }

    public static int[] largestAndSmallestNumbers(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            for(int j= i+1;j<arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
