class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        int [] newNums = new int[nums.length * 2];
        for(int i= nums.length;i < newNums.length;i++){
            newNums[i] = nums[i-nums.length];
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=newNums.length-1; i >= nums.length;i--){
            stack.push(newNums[i]);
        }
        for(int i= nums.length-1; i>=0;i--){
            if(!stack.isEmpty() && stack.peek() > nums[i]){
                result[i] = stack.peek();
            }
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            } else {
                result[i] = -1;
            }
            stack.push(nums[i]);
        }
        return result;
    }
}
