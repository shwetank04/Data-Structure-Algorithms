public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        // A
        // B B
        // C C C
        char start = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
            }
            start = (char) (start+1);
            //Space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
