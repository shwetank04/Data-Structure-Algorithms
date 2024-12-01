import java.util.* ;
import java.io.*; 
public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int mid = 0;
        int high = arr.size() - 1;
        int low = 0;
        while(mid <= high){
         if(arr.get(mid)==0){
             swap(low,mid,arr);
             low++;
             mid++;
         }
         else if(arr.get(mid) == 1){
             mid++;
         }
         else{
             swap(mid,high,arr);
             high--;
            }
        }
    }

    public static void swap(int a,int b, ArrayList<Integer> arr){
        int temp = arr.get(b);
        arr.set(b, arr.get(a));
        arr.set(a, temp);
    }
}
