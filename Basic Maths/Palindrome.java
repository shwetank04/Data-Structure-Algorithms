public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int reverse = 0;
        int lastDigit =0;
        int original = n;
        while(n>0){
            lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n/10;
        }
        if(original == reverse){
            return true;
        }
        return false;
    }
}
