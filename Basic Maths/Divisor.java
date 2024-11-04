import java.util.ArrayList;
import java.util.List;
public class Solution{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> divisors = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                divisors.add(i);
            }
        }
        return divisors;
    }
}


// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// public class Solution{
//     public static List< Integer > printDivisors(int n) {
//         // Write your code here
//         List<Integer> divisors = new ArrayList<>();
//         for(int i=1;i<=Math.sqrt(n);i++){
//         if(n%i == 0){
//             divisors.add(i);
//             if(n/i !=i){
//                 divisors.add(n/i);
//             }
//         }
//         }
//          Collections.sort(divisors);
//          return divisors;
//     }
// }
