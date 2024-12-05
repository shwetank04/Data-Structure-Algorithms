import java.lang.*;
public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int low = 0;
        int high = arr.length -1;
        int lowerBound = x;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= x){
                high = mid-1;
                lowerBound = Math.min(lowerBound,mid);
            }
            else{
                low = mid+1;
            }
        }
        return lowerBound;
    }
}
