1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

  // Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        starPattern(5);
    }

    public static void starPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(i+1+" ");
            }
            System.out.println("");
        }
    }
}
