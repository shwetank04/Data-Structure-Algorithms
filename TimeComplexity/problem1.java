public class main {
    public static void main(String args[]) {
        int n = 5;
        for(int i=0; i< n ;i++) {
            for (int j=0; j<n ;j++){
                //some logic with constant time
            }
        }
    }
}

//Time complexitiy of above code will be :- O(n^2).
// If n = 5, j will run for 5 + 5 + 5 + 5 + 5 which is nothing but 5 square.
