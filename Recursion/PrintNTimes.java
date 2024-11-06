public class main {
    public static void main(String args[]) {
        int n = 4;
        printLinearly(1,n);
        }

    private static void printLinearly(int i,int n) {
        if(i > n){
            return;
        }
        System.out.println(i);
        i++;
        printLinearly(i,n);
    }
}
