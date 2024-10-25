class Solution {
    static int dataTypeSize(String str) {
        // code here
     if (str.equals("Character")) {
            return Character.BYTES; // 2 bytes
        } else if (str.equals("Integer")) {
            return Integer.BYTES; // 4 bytes
        } else if (str.equals("Long")) {
            return Long.BYTES; // 8 bytes
        } else if (str.equals("Float")) {
            return Float.BYTES; // 4 bytes
        } else if (str.equals("Double")) {
            return Double.BYTES; // 8 bytes
        } else {
            return -1; // Return -1 for unknown data types
        }
    }
}
