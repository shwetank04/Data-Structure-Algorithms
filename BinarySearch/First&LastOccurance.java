import java.util.*;
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int low = 0;
        int high = n-1;
        int firstOccurance = -1;
        int lastOccurance = -1;
        while(low <= high) {
            int mid = (low+high) / 2;
            if(arr.get(mid) >= k){
                high = mid -1;
                if(arr.get(mid) == k){
                firstOccurance = mid;
                }
            }
            else{
                low = mid + 1;
            }
        }
        low = 0;
        high = n-1;
        while(low <=high){
          int mid = (low+high) / 2;
          if(arr.get(mid) == k) {
              lastOccurance = mid;
              low = mid + 1;
          }
          else if(arr.get(mid) >k){
              high = mid -1;
          }
          else{
              low = mid +1;
          }
        }
        int result[] = new int[2];
        if(firstOccurance == n){
            firstOccurance = -1;
        }
        result[0] = firstOccurance;
        result[1] = lastOccurance;
        return result;
    }

};
