public class main {
    public static void main(String args[]) {
        int n = 4;
        backtrack(1,n);
        }

    private static void backtrack(int i,int n) {
        if(i>n){
            return;
        }
        backtrack(i+1,n);
        System.out.println(i);
    }
}
