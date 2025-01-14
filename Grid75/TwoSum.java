class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i=0;
        int j= i+1;
        while(i<nums.length-1){
            if(nums[i] + nums[j] == target){
                result[0] = i;
                result[1] = j;
                return result;
            }
            if(j == nums.length-1){
                i++;
                j=i+1;
            }
            else{
            j++;
            }
        }
        return result;
    }
}

//Can also be done using HashMap.

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers that sum up to the target
                return new int[] { map.get(complement), i };
            }
            
            // If not, store the number and its index in the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (though per problem statement, one solution is assumed)
        return new int[] {};
    }
}
