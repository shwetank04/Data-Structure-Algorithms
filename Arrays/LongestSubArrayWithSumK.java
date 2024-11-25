public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        long prefixSum = 0;
        int length = 0;
        Map<Long,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
          prefixSum += a[i];
          if(prefixSum == k){
              length = Math.max(length,i+1);
          }
          long rem = prefixSum - k;
          if(map.containsKey(rem)){
            length = Math.max(length, i- map.get(rem));
          }
         map.putIfAbsent(prefixSum, i);
        }
        return length;
    }
}
