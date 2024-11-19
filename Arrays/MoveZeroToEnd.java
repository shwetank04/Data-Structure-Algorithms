public class Solution {
        public static int[] moveZeros(int n, int []arr) {
        // Write your code here.
        int j = -1;
        for(int k=0;k<n;k++) {
            if(arr[k] == 0) {
                j = k;
                break;
            }
        }
        if(j == -1){
            return arr;
        }
        for(int i=j+1;i<n;i++) {
            if(arr[i] !=0) {
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              j++;
            }
        }
        return arr;
    }
}
