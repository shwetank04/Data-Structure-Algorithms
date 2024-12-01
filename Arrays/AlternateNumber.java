public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int arr[] = new int[a.length];
        int positive = 0;
        int negative = 1;
        for(int i=0;i<a.length;i++) {
            if(a[i] > 0 && positive <= a.length -2 ){
                arr[positive] = a[i];
                positive+=2;
            }
            else if(negative <= a.length -1){
                arr[negative] = a[i];
                negative+=2;
            }
        }
        return arr;
    }
}
