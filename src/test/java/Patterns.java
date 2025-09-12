public class Patterns {
    public static void main(String[] args){
        int n= 5;
        leftHalfDiamondPattern(5);
    }
    /*
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
     */
    static void squareFillPattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

       /*   *
            **
            ***
            ****
            *****  */
    static void rightHalfPyramid(int n){
        for(int row =1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
          *
         **
        ***
       ****
      *****
 */
    static void leftHalfPyramid(int n){
        for(int row =1;row<=n;row++){
            int noOfSpaces = n-row;
            for(int s=0;s<noOfSpaces;s++){
                System.out.print("  ");
            }
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
     *
    * *
   * * *
  * * * *
 * * * * *

 */
    static void trianglePattern(int n){
        for(int row=1;row<=n;row++){
            int noOfSpaces = n-row;
            for(int s=0;s<noOfSpaces;s++){
                System.out.print(" ");
            }
            int totalNoOfCol = row;
            for(int col=1;col<=totalNoOfCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */
    static void reverseRightHalfPyramid(int n){
        for(int row=1;row<=n;row++){
            for(int col = 1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
         *****
       *****
     *****
   *****
 *****
 */
    static void rhombusPattern(int n){
        for(int row=1;row<=n;row++){
            int noOfSpaces = n-row;
            for(int s=1;s<=noOfSpaces;s++){
                System.out.print("  ");
            }
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
 *****
  ****
   ***
    **
     *
 */
    static void reverseLeftHalfPyramid(int n){
        for(int row=1;row<=n;row++){
            int noOfSpaces = row-1;
            for(int s=1;s<=noOfSpaces;s++){
                System.out.print("  ");
            }
            int totalNoOfCol = n-row+1;
            for(int col=1;col<=totalNoOfCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
          *
        * *
      * * *
    * * * *
  * * * * *
    * * * *
      * * *
        * *
          *
     */

    static void leftHalfDiamondPattern(int n){
        for(int row = 1;row <2*n ; row++){
            int noOfSpaces = row>n ?row-n:n-row;
            for(int s=1;s<=noOfSpaces;s++){
                System.out.print(" ");
            }
            int totalNoOfCol = row > n ? (2 * n) - row : row;
            for (int col = 1; col <= totalNoOfCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

     */
    static void rightHalfDiamondPattern(int n){
        for(int row =1;row<2*n;row++){
            int totalNoOfCol;
            if(row<n){
                totalNoOfCol = row;
                for(int col = 1;col<=totalNoOfCol;col++){
                    System.out.print("* ");
                }
            }else{
                totalNoOfCol = 2*n-row;
                for(int col = 1;col<=totalNoOfCol;col++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */
    static void diamondPattern(int n){
        for(int row=1;row<=2*n;row++){
            int noOfSpaces = row<n?n-row:row-n;
            for(int s=1;s<=noOfSpaces;s++){
                System.out.print(" ");
            }
            int totalNoOfCol = row<n?row:2*n-row;
            for(int col=1;col<=totalNoOfCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
