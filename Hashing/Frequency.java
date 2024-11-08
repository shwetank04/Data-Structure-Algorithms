class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        int hashArray[] = new int[N];
        for(int i=0;i<N;i++){
            if(arr[i]-1 < N){
            hashArray[arr[i] -1] += 1;
            }
        }
        Arrays.fill(arr,0);
        for(int i=0;i<N;i++){
            arr[i] = hashArray[i];
        }
    }
}
