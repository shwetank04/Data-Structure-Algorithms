public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        // A B C
        // A B
        // A
        for(int i=0;i<n;i++){
            char start = 'A';
            for(int j=n-1;j>=i;j--){
                System.out.print(start+" ");
                start = (char) (start+1);
            }
            //Space
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
