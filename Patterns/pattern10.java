public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
      // 1
      // 0 1
      // 1 0 1
        int startWith = 0;
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                startWith = 1;
            }
            else{
                startWith =0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(startWith+" ");
                if(startWith==0){
                    startWith =1;
                }
                else{
                    startWith=0;
                }
            }
            //Space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
