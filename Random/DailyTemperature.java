class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < temperatures.length; i++) {
            // While the stack is not empty and the current temperature is greater than
            // the temperature of the index at the top of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();  // Get the index of the previous temperature
                answer[index] = i - index;  // Calculate the number of days until a warmer temperature
            }
            stack.push(i);  // Push the current index onto the stack
        }
        
        return answer;
    }
}
