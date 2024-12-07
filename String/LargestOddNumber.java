class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        int length = sb.length();
        while(length > 0){
           if ((sb.charAt(length - 1) - '0') % 2 != 0) {
                return sb.substring(0, length);
            }
            length--;

        }
        return "";
    }
}
