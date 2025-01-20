class Solution {
    public int singleNonDuplicate(int[] arr) {
        int low = 1;
        int high = arr.length -2;
        if(arr.length == 1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[arr.length-1] != arr[arr.length-2]){
            return arr[arr.length-1];
        }
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] != arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            if(mid%2 != 0 && arr[mid-1] == arr[mid] || mid % 2 == 0 && arr[mid] == arr[mid+1]){
               low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
