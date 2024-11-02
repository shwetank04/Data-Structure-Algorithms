public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
        //     A
        //   A B A
        // A B C B A
        for(int i=0;i<n;i++){
            char start = 'A';
            int space = (2*i)+1;
            //Space
            for(int j=0;j<(n-i)-1;j++){
                System.out.print(" ");
            }
            //Alphabet
            for (int j = 0; j < space; j++) {
                System.out.print(start + " ");
                if(j < (space/2)){
                    start++;
                }
                else{
                    start--;
                }
            }
            //Space
            for(int j=0;j<(n-i)-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
