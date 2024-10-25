import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fibonaciSeries(n));
	}
		public static int fibonaciSeries(int n){
		int fibonaci[] = new int[n+1];
		int result = 0;
		if(n == 1 || n == 2 ){
			return 1;
		}
		fibonaci[1] = 1;
		fibonaci[2] = 1;
		for(int i=3 ; i<=n ;i++) {
			fibonaci[i] = fibonaci[i-1] + fibonaci[i-2];
			}
		return fibonaci[n];
		}
}
