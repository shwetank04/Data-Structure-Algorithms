public class Solution {
    public static int findMin(int []arr) {
        // Write your code here.
        int size = arr.length;
        int low = 0;
        int high = size - 1;
        int minimum = Integer.MAX_VALUE;
        while(low <=high){
        int mid = (low+high) / 2;
        if(arr[low] <= arr[mid]){
            minimum = Math.min(minimum, arr[low]);
            low = mid + 1;
            }
        else{
            minimum = Math.min(minimum,arr[mid]);
            high = mid-1;
        }
      }
        return minimum;
    }
}
