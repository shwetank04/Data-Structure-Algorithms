public class Solution {
    public static void nNumberTriangle(int n) {
      // 1
      // 2 3
      // 4 5 6
        int helper =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(helper+" ");
                helper++;
            }
            //Space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
