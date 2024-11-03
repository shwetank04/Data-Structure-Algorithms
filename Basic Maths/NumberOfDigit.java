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

// Time Complexity = O(log10(n)); :- Number of times it is getting divisible by 10. If its getting divied by 5 then it will be log5(n) 
