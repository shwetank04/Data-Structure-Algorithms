public class Solution {
    public static void getStarPattern(int n) {
        // Write your code here
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1) { 
                for(int j=0;j<n;j++) { 
                    System.out.print("*");
                }
            }
            else{
                System.out.print("* ");
                //Space
                for(int j=0;j<n-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
