import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
        int digits =0;
        int original=n,original2= n;
        while(n>0){
            digits++;
            n = n/10;
        }
        while(original > 0){
            int digit = original % 10;
            sum += Math.pow(digit, digits);
            original = original /10;
        }
        if(sum == original2){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
	}
}
