class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i] >0){
                stack.push(asteroids[i]);
            }
            else{
            while(!stack.isEmpty() && asteroids[i]< 0 && stack.peek()>0 && stack.peek() < Math.abs (asteroids[i])){
                stack.pop();
                }
            if(!stack.isEmpty() && Math.abs(asteroids[i]) == stack.peek()){
                stack.pop();
            }
            else if(stack.isEmpty() || stack.peek()<0){
                stack.push(asteroids[i]);
               }
            }
        }
         int [] result = new int[stack.size()];
         Iterator value = stack.iterator();
         int i = 0;
        while (value.hasNext()) { 
           result[i] = (int) value.next();
           i++;
        } 
        return result;
    }
}
