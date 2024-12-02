import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> leaders = new ArrayList<>();
        int n = a.length;
        int max = a[n-1];
        leaders.add(max);
        for(int i=n-2;i>=0;i--){
            if(a[i] > max){
                leaders.add(a[i]);
                max = a[i];
            }
        }
        return leaders;
    }
}
