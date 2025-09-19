public class NextGreatestLetter {
    public static void main(String[] args){
        char[] letters = {'c','f','j'};
        char target = 'd';
        char greatestLetter = nextGreatestLetter(letters,target);
        System.out.println(greatestLetter);
    }
    public static char nextGreatestLetter(char[] letters,char target){
        char greatestLetter = letters[0];  //c
        int left = 0;
        int right = letters.length-1;
        while(left<=right){
            int mid = left +(right-left) /2;
            if(letters[mid] <=target){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        return letters[left%letters.length];
    }
}
