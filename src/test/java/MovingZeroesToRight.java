public class MovingZeroesToRight {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        int[] afterMovingZeroesToRight = movingZeroesToRight(arr);
        for(int num:afterMovingZeroesToRight){
            System.out.print(num+" ");
        }
    }
    public static int[] movingZeroesToRight(int[] arr){
        int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }

        return arr;

    }
}
