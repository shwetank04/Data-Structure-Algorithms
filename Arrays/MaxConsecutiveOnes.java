public class Solution {
	public static int consecutiveOnes(int n, int[] arr) {
		// Write your code here.
		int max = 0;
		int current = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 1){
				current++;
				if(current > max){
					max = current;
				}
			}
			else{
				current = 0;
			}
		}
		return max;
	}
}
