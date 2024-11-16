public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        ArrayList<Integer> temp = new ArrayList<>();
        int size = arr.size();
        k = k%size;
        int j=0;
        //Store first k elements
        for(int i=0;i<k;i++){
            temp.add(i,arr.get(i));
        }

        //Shift left
        for(int i=k;i<size;i++){
            arr.set(i-k, arr.get(i));
        }

        //Put back temp into array
        for(int i =size-k;i<size;i++){
            arr.set(i,temp.get(j));
            j++;
        }
        return arr;
    }
}
