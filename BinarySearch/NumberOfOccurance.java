public class Solution {
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int firstOccurance = -1;
        int lastOccurance = -1;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                firstOccurance = mid;
                high = mid -1;
            }
            else if(arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        low = 0;
        high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                lastOccurance = mid;
                low = mid + 1;
            }
            else if(arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        if(firstOccurance == -1 || lastOccurance == -1 ){
            return 0;
        }
        return (lastOccurance - firstOccurance) + 1;
    }
}
