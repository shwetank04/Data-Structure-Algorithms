public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
      // 1         1
      // 1 2     2 1
      // 1 2 3 3 2 1
        int space = 2*(n-1);
        for(int i=1;i<=n;i++){
            //print num
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //Space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //print num again 
                for(int k=i;k>=1;k--) {
                    System.out.print(k + " ");
                }
            System.out.println("");
                space-=2;
        }
    }
}
