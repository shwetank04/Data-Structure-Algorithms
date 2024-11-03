public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        // * * * * * * 
        // * *     * * 
        // *         * 
        // *         * 
        // * *     * *
        // * * * * * *
        int space = 0;
        for(int i=0;i<n;i++) {
            //Star
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            //Space
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println("");
            space +=2;
        }
        int initSpace = n-2;
        for(int i=1;i<=n;i++){
            //Star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //Space
            for(int j=0;j<=initSpace;j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            initSpace -=2;
            System.out.println("");
        }
    }
}
