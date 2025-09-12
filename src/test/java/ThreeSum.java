public class ThreeSum {
    public static void main(String[] args){
        int[] num = {1,4,6,8,10,45};
        int target = 22;
        int[] requiredIndicies = threeSum(num,target);
        for(int nu:requiredIndicies){
            System.out.print(nu+" ");
        }

    }
    public static int[] threeSum(int[] num,int target){
        int [] requiredIndicies = new int[3];
        for(int i=0;i<num.length;i++){
            for(int j = i+1;j< num.length;j++){
                for(int k =j+1;k<num.length;k++){
                    int sum = num[i]+num[j]+num[k];
                    if(sum == target){
                        requiredIndicies [0] = i;
                        requiredIndicies [1] = j;
                        requiredIndicies [2] = k;
                        break;
                    }
                }
            }
        }
        return requiredIndicies;
    }
}
