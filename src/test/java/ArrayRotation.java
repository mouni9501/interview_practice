public class ArrayRotation {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7}; // {6,7,1,2,3,4,5}
        int k = 2;
        int[] result = arrayRotation(num,k);
        for(int n:result){
            System.out.print(n+" ");
        }
    }

    public static int[] arrayRotation(int[] num, int k) {
        int arrayLength = num.length;
        if (k > arrayLength) {
            k = k % arrayLength;
        }
        reverseArray(num, 0, arrayLength - 1);
        reverseArray(num, 0, k - 1);
        reverseArray(num, k, arrayLength - 1);
        return num;
    }


    public static void reverseArray(int[] num, int startingIndex, int endingIndex) {
        while (startingIndex < endingIndex) {
            int temp = num[startingIndex];
            num[startingIndex] = num[endingIndex];
            num[endingIndex] = temp;
            startingIndex++;
            endingIndex--;
        }
    }
}

//    public static int[] arrayRotation(int[] num,int k){
//        int[] result = new int[num.length];
//        System.out.println("length is: "+num.length);
//        int m=0;
//        for(int i=0;i<num.length;i++){
//            int index = k+i;
//            if(index>=num.length){
//                result[m] = num[i];
//                m = m+1;
//            }else{
//                result[index] = num[i];
//            }
//        }
//        return result;
//    }

