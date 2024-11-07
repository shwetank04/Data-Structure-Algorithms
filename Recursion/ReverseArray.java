//Two Pointer Approach
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int reversearr[];
        int i =0;
        int n = arr.length-1;
        reverseArrayFact(i,n,arr);
    }
    public void reverseArrayFact(int i,int n,int arr[]){
        if(i >= n){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        reverseArrayFact(i+1, n-1,arr);
    }
}



// class Solution {
//     public void reverseArray(int arr[]) {
//         // code here
//         int i=0;
//         int n = arr.length;
//         reverseArrayFact(i,n,arr);
//     }
//     public void reverseArrayFact(int i, int n,int arr[]){
//         if(i >= n/2){
//             return;
//         }
//         int temp = arr[i];
//         arr[i] = arr[n-i-1];
//         arr[n-i-1] = temp;
//         reverseArrayFact(i+1,n,arr);
//     }
// }
