import java.util.ArrayList;

public class FindRestaurant {
    public static void main(String[] args){
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] result = findRestaurant(list1,list2);
        for(String num:result){
            System.out.print(num+" ");
        }
    }
    public static String[] findRestaurant(String[] list1,String[] list2){
        int minSum = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                   int sum = i+j;
                    if(sum<minSum){
                        minSum =sum;
                        result.clear();
                        result.add(list1[i]);
                    }else if(sum == minSum){
                        result.add(list1[i]);
                    }
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
