class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<num.length();i++){
              int currentDigit = num.charAt(i) - '0';
            while (!stack.isEmpty() && k > 0 && stack.peek() > currentDigit) {
                stack.pop();
                k--;
            }
            stack.push(currentDigit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        for (int digit : stack) {
            if (leadingZero && digit == 0) {
                continue;
            }
            leadingZero = false;
            result.append(digit);
        }
        return result.length() == 0 ? "0" : result.toString();
    }
}
