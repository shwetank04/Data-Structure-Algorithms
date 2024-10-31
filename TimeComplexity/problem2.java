public class main {
    public static void main(String args[]) {
        int n = 5;
        for(int i=0; i< n ;i++) {
            for (int j=0; j<=i ;j++){
                //some logic with constant time
            }
        }
    }
}

//Time complexitiy of above code will be :- O(n^2).
// If n = 5 then,
// i=0 : j will run for 1
// i=1 : j will run for 2
// i=2 : j will run for 3
// so j is running for i+1 times and i is running till n, so it will be n*(n+1)/2 = n^2
