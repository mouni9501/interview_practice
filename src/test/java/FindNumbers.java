public class FindNumbers {
    public static void main(String[] args){
        int[] nums = {555,901,482,1771};
        int result = findNumbers(nums);
        System.out.println(result);
    }
    public static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            String st = Integer.toString(num);
            int length = st.length();
            if (length % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}
