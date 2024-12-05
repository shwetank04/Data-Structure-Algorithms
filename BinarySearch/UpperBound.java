public class Solution {
    public static int upperBound(int []arr, int x, int n){
        int low = 0;
        int high = arr.length -1;
        int lowerBound = n;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x){
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
