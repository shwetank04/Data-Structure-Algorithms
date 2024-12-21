class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int zero = 0;
        int length = 0;
        int maxLength = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                zero++;
            }
            while(zero > k){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
            if(zero <=k){
                length = (right-left)+1;
                maxLength = Math.max(length,maxLength);
            }
            right++;
        }
        return maxLength;
    }
}
