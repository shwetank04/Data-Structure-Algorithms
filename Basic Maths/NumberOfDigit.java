public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int result = 0;
        while(n > 0){
            n = n/10;
            result++;
        }
        return result;
    }
}
