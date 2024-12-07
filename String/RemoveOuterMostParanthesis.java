class Solution {
    public String removeOuterParentheses(String s) {
        int count = 1;
        StringBuilder newString = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == '('){
                count ++;
                if(count > 1){
                    newString.append('(');
                }
            }
            else{
                if(count > 1){
                    newString.append(')');
                }
                count --;
            }
        }
        return newString.toString();
    }
}
