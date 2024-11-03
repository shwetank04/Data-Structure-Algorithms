public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        // C
        // C B 
        // C B A
        char initChar = 'A';
        for(int i=1;i<n;i++){
            initChar++;
        }
        for(int i=0;i<n;i++){
            char startWith = initChar;
            for(int j=0;j<=i;j++){
                System.out.print(startWith+" ");
                startWith--;
            }
            //Space
            for(int j=0;j<-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
