class Solution
{
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<=n-2;i++) {
	        int min = i;
	        for(int j=i;j<=n-1;j++) {
	            if(arr[j] < arr[min]){
    	            int temp = arr[j];
    	            arr[j] = arr[min];
    	            arr[min] = temp;
	            }
	        }
	    }
	}
}
