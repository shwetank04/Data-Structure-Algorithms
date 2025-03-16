class Solution {
	 public static boolean check(int[] nums) {
	    int n = nums.length;
        int count = 1;
        for(int i=1;i<nums.length *2 - 1;i++){
            if(nums[(i -1)%n] <= nums[i%n]){
                count ++;
            }
            else{
                count = 1;
            }
            if(count == nums.length){
            return true;
            }
        }
        return false;
	}
}
