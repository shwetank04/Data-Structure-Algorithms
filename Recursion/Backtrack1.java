public class main {
    public static void main(String args[]) {
        int n = 4;
        backtrack(n,n);
        }

    private static void backtrack(int i,int n) {
        if(i<1){
            return;
        }
        backtrack(i-1,n);
        System.out.println(i);
    }
}
