public class Solution {
    public static int searchInsert(int [] arr, int m){
        // Write your code here.
        int low = 0;
        int high = arr.length-1;
        int result = arr.length;
        while(low<= high){
            int mid = (low+high) / 2;
            if(arr[mid] >= m){
                 result = mid;
                 high = mid -1;
            }
            else if(arr[mid] < m){
                low = mid +1;
            }
        }
        return result;
    }
}
