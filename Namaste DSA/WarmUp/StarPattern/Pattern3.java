1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        starPattern(5);
    }

    public static void starPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1+" ");
            }
            System.out.println("");
        }
    }
}
