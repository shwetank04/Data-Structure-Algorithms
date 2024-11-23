public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        int i=0;
        int j=1;
        if( arr.length == 1){
            return arr[i];
        }
        else if(arr.length < j && arr[i] != arr[j]){
            return -1;
        }
        while(i + 2 < arr.length && j+2 < arr.length){
            if(arr[i] != arr[j]){
                return arr[i];
            }
            else{
                i+=2;
                j+=2;
            }
        }
        if(j < arr.length){
            if(arr[i] != arr[j] && arr[j] == arr[j+1]){
                return arr[i];
            }
            else if(arr[i] == arr[j] && arr[j]!= arr[j+1]){
                return arr[j+1];
            }
            else{
                return -1;
            }
        }
        return -1;
    }
}
