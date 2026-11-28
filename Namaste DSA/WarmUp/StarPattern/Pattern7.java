1     
10    
101   
1010  
10101 
101010

class Main {
    public static void main(String[] args) {
        printPattern(6);
    }

    public static void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                if(j%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            for(int k=0;k<n-(i+1);k++){
                System.out.print(" ");
            }
                 System.out.println();
        }
    }
}
