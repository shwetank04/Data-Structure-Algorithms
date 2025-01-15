class Solution {
    static int evenlyDivides(int n) {
        // code here
        int result = 0;
        int lastDigit = 0;
        int temp = n;
        while(temp > 0){
            lastDigit = temp % 10;
            if(lastDigit !=0 && n % lastDigit == 0){
                result++;
            }
            temp = temp /10;
        }
        return result;
    }
}
