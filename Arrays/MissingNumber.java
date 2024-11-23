public class Solution {
    public static int missingNumber(int []a, int N) {
        // Write your code here.
        int sum = N*(N+1)/2;
        int sum2 = 0;
        for(int i=0;i<a.length;i++){
            sum2 += a[i];
        }
        return sum - sum2;
    }
}
