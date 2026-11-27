   *
   **
  ***
 ****
*****

     // Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        starPattern(5);
    }

    public static void starPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=n-(i+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
