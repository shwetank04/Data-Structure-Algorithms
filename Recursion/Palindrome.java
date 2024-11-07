class Solution {
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        String workingString = lowerCase.replaceAll("[^a-zA-Z0-9]", "");
        int length = workingString.length() -1;
        boolean result = checkPalindrome(length,workingString,0);
        return result;
    }
    public boolean checkPalindrome(int n, String s,int i){
        if(i >= n) {
            return true;
        }
        if(s.charAt(i)!=s.charAt(n)) {
            return false;
        }
        return checkPalindrome(n-1,s,i+1);
    }
}
