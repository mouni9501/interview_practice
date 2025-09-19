public class FindCloset {
    public static void main(String[] args){
        int  x = 2, y = 5, z = 6;
        int position = findCloset(x,y,z);
        System.out.println(position);
    }
    public static int findCloset(int x,int y,int z){
         int xzDifference  = Math.abs(z-x);
         int yxDifference  = Math.abs(z-y);
         int position = 0;
         if(xzDifference < yxDifference){
             return position = 1;

         }else if(yxDifference < xzDifference){
             return position = 2;
         }
        return position;
    }
}
