public class main {
    public static void main(String args[]) {
        int n = 4;
        printNames(1,n);
        }

    private static void printNames(int i,int n) {
        if(i > n){
            return;
        }
        System.out.println("Shwetank");
        i++;
        printNames(i,n);
    }
}
