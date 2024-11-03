public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        // *         *
        // * *     * *
        // * * * * * *
        // * *     * *
        // *         *
           int space = (2 * n) - 2;
        for (int i = 0; i < n; i++) {
            //Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            //Spaces
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            //Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            space -= 2;
        }
        int initSpace = (2 * n) - 4;
        int stars = n-1;
        for (int i = 0; i < n - 1; i++) {
            //Star
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            //Space
            for (int j = 0; j < initSpace; j++) {
                System.out.print("  ");
            }
            //Star
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            initSpace += 2;
            stars--;
        }
    }
}
