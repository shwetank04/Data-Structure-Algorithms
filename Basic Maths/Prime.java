import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //Your code goes here
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int a = sc.nextInt();
        List<Integer> divisors = new ArrayList<>();
        for(int i =2; i<= Math.sqrt(a); i++ ){
            if(a%i == 0){
                isPrime = false;
               System.out.print("false");
               break;
            }
        }
        if(isPrime){
            System.out.print("true");
        }
    }
}
