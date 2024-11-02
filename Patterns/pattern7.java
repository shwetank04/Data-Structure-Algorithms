public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        // *****
        //  ***
        //   *
        for(int i=0;i<=n;i++){
            //Space
            for(int j=0;j<i;j++){
               System.out.print(" "); 
            }
            //Stars
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            //Space
            for(int j=0;j<i;j++){
               System.out.print(" "); 
            }
             System.out.println("");
        }
    }
}
