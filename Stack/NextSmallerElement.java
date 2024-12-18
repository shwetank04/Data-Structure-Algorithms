public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<A.size();i++){
            while(!stack.isEmpty() && stack.peek() >= A.get(i)){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result.add(stack.peek());
            }
            else{
                result.add(-1);
            }
            stack.push(A.get(i));
        }
        return result;
    }
}
