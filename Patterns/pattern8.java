public class main {
    public static void main(String args[]) {
        // Write your code here
        //   *
        //  ***
        // *****
        // *****
        //  ***
        //   *
        int n=6;
        for(int i=0;i<n;i++){
            //Space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=0;j<(2*i)+1;j++){
                System.out.print("*");
            }
            //Space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            //Space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=0;j<2 * (n - i) - 1;j++){
                System.out.print("*");
            }
            //Space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
