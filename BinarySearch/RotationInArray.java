

public class Solution {
    public static int findKRotation(int []arr) {
        // Write your code here.
        int low = 0;
        int high = arr.length - 1;
        int minimum = Integer.MAX_VALUE;
        int idx = 0;
        while(low <=high){
            int mid = (low+high)/2;
            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (arr[low] <= arr[high]) {
                if (arr[low] < minimum) {
                    idx = low;
                    minimum = arr[low];
                }
                break;
            }
            if(arr[low] <= arr[mid]){
                if(minimum > arr[low]){
                    minimum = arr[low];
                    idx = low;
                }
                low = mid + 1;
            }
            else{
                if(arr[mid] < minimum){
                    idx = mid;
                    minimum = arr[mid];
                }
                high = mid-1;
            }
        }
        return idx;
    }
}
