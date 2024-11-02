public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        // A
        // A B
        // A B C
        for(int i=0;i<=n;i++){
            char start = 'A';
            for(int j=0;j<i;j++){
                System.out.print(start+" ");
                start = (char) (start + 1);
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
