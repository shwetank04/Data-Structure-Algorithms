public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<book.length;i++){
            if(map.containsKey(target - book[i])){
                return "YES";
            }
            else{
                map.put(book[i],i);
            }
        }
        return "NO";
    }
}
