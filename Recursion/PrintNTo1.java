public class main {
    public static void main(String args[]) {
        int n = 4;
        printnto1(n);
        }

    private static void printnto1(int n) {
        if(n<1){
            return;
        }
        System.out.println(n);
        n--;
        printnto1(n);
    }
}
