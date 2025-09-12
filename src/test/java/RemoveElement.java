import java.util.Arrays;
import java.util.Collections;

public class RemoveElement {
    public static void main(String[] args){
        int[] arr = {3,2,2,3};
        int val = 3;
       int result =  removeElement(arr,val);


            System.out.print("Size of an array after removing the duplicates: "+result);

    }

    public static int removeElement(int[] arr,int val){ //{3,2,2,3}

        int count = 0;
        for(int i=0;i<arr.length;i++){ //3 //2
            if(arr[i]!=val){ //2
                arr[count] = arr[i];
                count++;
            }
        }




   /* for(int i=0;i<arr.length;i++){
        if(arr[i]==val){
            arr[i] = -1;
        }
    }
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<=arr.length-1;j++){
            if(arr[i]<arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    int count =0;
    for(int num :arr){
        if(num!=-1){
        count++;
        }
    }
    return count;*/
        for(int num :arr){
            System.out.print(num+" ");
        }
        return count;
    }
}
