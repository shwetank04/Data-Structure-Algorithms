public class Solution {
    public static void nStarTriangle(int n) {
        // *
        // **
        // ***
        // **
        // *
        // Write your code here
        for(int i=1;i<=n;i++){
            //Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=1;i<=n-1;i++){
            //Stars
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            //Space
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
