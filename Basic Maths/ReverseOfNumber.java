import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverse = 0;
		int lastdigit = 0;
		while(n>0){
			lastdigit = n%10;
			reverse  = reverse * 10 + lastdigit;
			n= n/10;
		}
		System.out.print(reverse);
	}
}
