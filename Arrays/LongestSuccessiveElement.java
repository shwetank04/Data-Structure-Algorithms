import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int len = a.length;
        int max = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) +1 );
            }
            else{
                map.put(a[i], 1);
            }
        }
        for(int i=0;i<a.length;i++) {
            int j = a[i];
            sum = 0;
           while(map.get(j) != null) 
           {
                j++;
                sum++;
           }
           if(sum > max){
               max = sum;
           }
        }
        return max;
    }
}
